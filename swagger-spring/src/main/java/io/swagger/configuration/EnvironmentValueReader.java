package io.swagger.configuration;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EnvironmentValueReader {

	private final static String VCAP_SERVICES = "VCAP_SERVICES";
	private final static String DB_POSTGRESQL = "postgresql";
	private final static String DB_CREDENTIALS = "credentials";
	
	public static JsonNode getHANACredentials() {
		JsonNode credentials = null;
		String vcapServices = Environment.read(VCAP_SERVICES);
		try {
			JsonNode vcapServicesAsJSON = new ObjectMapper().readTree(vcapServices);
			credentials = vcapServicesAsJSON.get(DB_POSTGRESQL).get(0).get(DB_CREDENTIALS);
		} catch (IOException e) {
			System.out.println(VCAP_SERVICES + ": " + vcapServices);
			e.printStackTrace();
		}
		return credentials;
	}
	
	public static String getValueByKey(String key) {
		return Environment.read(key);
	}
	
	private static class Environment {

		static String read(String key) {
			return System.getenv(key);
		}
	}

}