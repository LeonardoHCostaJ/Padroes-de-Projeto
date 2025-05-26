package com.curso.projeto3105;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.curso")
@EntityScan(basePackages = {"com.curso.domains"})
@EnableJpaRepositories(basePackages = "com.curso.repositories")
@SpringBootApplication
public class Projeto3105Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto3105Application.class, args);
	}

}
