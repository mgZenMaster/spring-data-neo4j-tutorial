package com.example.demo;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.neo4j.driver.AccessMode;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final Driver driver;
	private final ConfigurableApplicationContext applicationContext;

	public DemoApplication(Driver driver, ConfigurableApplicationContext applicationContext) {
		this.driver = driver;
		this.applicationContext = applicationContext;
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		SessionConfig sessionConfig = SessionConfig.builder().withDefaultAccessMode(AccessMode.READ).build();

		try (Session session = driver.session(sessionConfig)) {
			session.run("CREATE (:Message {text: 'Hello World!'})");
		}

		applicationContext.close();
	}
}
