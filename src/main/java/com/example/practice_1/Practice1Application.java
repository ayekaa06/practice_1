package com.example.practice_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class Practice1Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice1Application.class, args);
    }

}
