package com.riteship.crs.employees.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;


//@TestConfiguration(proxyBeanMethods = false)
public class TestRiteShipCrsEmployeeMicroServiceApplication {

	/*@Bean
	@ServiceConnection
	KafkaContainer kafkaContainer() {
		return new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:latest"));
	}

	@Bean
	@ServiceConnection
	MariaDBContainer<?> mariaDbContainer() {
		return new MariaDBContainer<>(DockerImageName.parse("mariadb:latest"));
	}

	@Bean
	@ServiceConnection
	MongoDBContainer mongoDbContainer() {
		return new MongoDBContainer(DockerImageName.parse("mongo:latest"));
	}

	@Bean
	@ServiceConnection
	MySQLContainer<?> mysqlContainer() {
		return new MySQLContainer<>(DockerImageName.parse("mysql:latest"));
	}

	public static void main(String[] args) {
		SpringApplication.from(RiteShipCrsEmployeeMicroServiceApplication::main).with(TestRiteShipCrsEmployeeMicroServiceApplication.class).run(args);
	}*/

}
