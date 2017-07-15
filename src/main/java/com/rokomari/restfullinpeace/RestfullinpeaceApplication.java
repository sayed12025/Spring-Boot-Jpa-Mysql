package com.rokomari.restfullinpeace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackageClasses ="com.rokomari.restfullinpeace.repository")
@SpringBootApplication
public class RestfullinpeaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullinpeaceApplication.class, args);
	}
}
