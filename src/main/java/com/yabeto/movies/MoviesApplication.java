package com.yabeto.movies;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
	@Value("${spring.data.mongodb.uri}")
private String uri;

// @Value("${spring.data.mongodb.database}")
// private String db;

}
