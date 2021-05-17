package com.springboot.postgresqldatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PostgresqldatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqldatabaseApplication.class, args);
	}

}
