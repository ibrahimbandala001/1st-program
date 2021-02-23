package com.org.deprtemployee.deprtemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DeprtemployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeprtemployeeApplication.class, args);
	}

}
