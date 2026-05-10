package com.flashcard_shreedev.flashcard_backend;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //Disable automatic data source configuration since we do not have a database yet.
public class FlashcardBackendApplication {
	//Entry point of the application
	public static void main(String[] args) {
		SpringApplication.run(FlashcardBackendApplication.class, args);
	}

}
