package com.flashcard_shreedev.flashcard_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") //Path pattern for API endpoints
                .allowedOrigins("http://localhost:5173") //allowed origns for CORS
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") //Allowed HTTP methods
                .allowedHeaders("*") //Allowed headers
                .allowCredentials(true) //Allow credentials (cookies, authorization headers)
                .maxAge(3600); //Max age for preflight requests (in seconds)
    }
}
