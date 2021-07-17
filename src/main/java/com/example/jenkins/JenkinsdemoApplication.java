package com.example.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsdemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("started..");
	}
	
	public static void main(String[] args) {
		logger.info("Executing..");
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
