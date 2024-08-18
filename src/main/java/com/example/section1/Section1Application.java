package com.example.section1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan("com.example.section1.model")
//@EnableJpaRepositories("com.example.section1.repo")
public class Section1Application {

	public static void main(String[] args) {
		SpringApplication.run(Section1Application.class, args);
	}

}
