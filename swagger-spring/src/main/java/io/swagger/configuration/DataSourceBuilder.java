package io.swagger.configuration;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.fasterxml.jackson.databind.JsonNode;

/*Singelton Class*/
public class DataSourceBuilder {

	private static DataSourceBuilder dataSourceBuilder;
	private static DriverManagerDataSource dataSource;
	private static JdbcTemplate jdbcTemplate;

	private DataSourceBuilder() {
	}

	public static DataSourceBuilder getObject() {
		if (dataSourceBuilder == null) {
			synchronized (DataSourceBuilder.class) {
				dataSourceBuilder = new DataSourceBuilder();
			}
		}
		return dataSourceBuilder;
	}

	private DriverManagerDataSource getDataSource() {
		if (dataSource == null) {
			try {
				JsonNode hanaCredentials = EnvironmentValueReader.getHANACredentials();
				String url = "jdbc:postgresql://" + hanaCredentials.get("hostname").asText() + ":" + hanaCredentials.get("port").asText() + "/" + hanaCredentials.get("dbname").asText();
				String password = hanaCredentials.get("password").asText();
				String username = hanaCredentials.get("username").asText();
				dataSource = new DriverManagerDataSource(url, username, password);
				dataSource.setDriverClassName("org.postgresql.Driver"); 
			} catch (Exception e) {
				System.out.println("HANA connection failed");
				e.printStackTrace();
				return null;
			}
		}
		return dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		if (jdbcTemplate == null) {
			jdbcTemplate = new JdbcTemplate(getDataSource());
		}
		return jdbcTemplate;
	}
}
