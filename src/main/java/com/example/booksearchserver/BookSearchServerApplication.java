package com.example.booksearchserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.booksearchserver")
@EnableJpaRepositories(basePackages = "com.example.booksearchserver.domain")
@EntityScan(basePackages = "com.example.booksearchserver.domain")
public class BookSearchServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookSearchServerApplication.class, args);
	}

}
