package io.swagger;

import io.swagger.configuration.DataSourceBuilder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "io.swagger")
public class Swagger2SpringBoot implements CommandLineRunner {
	
	@Override
	public void run(String... arg0) throws Exception {
		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new ExitException();
		}
		createDatabaseTable();
	}

	public static void main(String[] args) throws Exception {
		new SpringApplication(Swagger2SpringBoot.class).run(args);
	}

	class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}

	}
	
	public void createDatabaseTable(){
	  /*String createOrderTableQuery = "CREATE TABLE OnlinePlaceOrderTable(OrderId VARCHAR(100), CustId VARCHAR(100), ProductId VARCHAR(100), Addresspincode VARCHAR(10), Addresslocation VARCHAR(100), Time TIMESTAMP, Status VARCHAR(24), ShareId VARCHAR(100))";
	  JdbcTemplate template = DataSourceBuilder.getObject().getJdbcTemplate();
	  template.execute(createOrderTableQuery);*/
	/*	String createOrderTableQuery = "CREATE TABLE OfflineUserTable(CustId VARCHAR(100), Name VARCHAR(100), PhoneNumer VARCHAR(100), Gender VARCHAR(10), Status VARCHAR(100), OfferId VARCHAR(100))";
		JdbcTemplate template = DataSourceBuilder.getObject().getJdbcTemplate();
		template.execute(createOrderTableQuery);*/
	}
}