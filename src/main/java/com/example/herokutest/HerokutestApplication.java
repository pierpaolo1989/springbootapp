package com.example.herokutest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HerokutestApplication implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(HerokutestApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(HerokutestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Prima applicazione deployata su Heroku con connessione al db");
	}

}
