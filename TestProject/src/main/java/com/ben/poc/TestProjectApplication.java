package com.ben.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {
	public static Logger logger= LoggerFactory.getLogger(TestProjectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		logger.info("testing application for jenkins");
	}

}
