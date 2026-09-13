package com.example.practice_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final AppProperties appProperties;

    public ApiController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, KBTU one love!";
    }

    @GetMapping("/config")
    public String config() {
        return "Message: " + appProperties.message()
                + ", Environment: " + appProperties.environment();
    }
}