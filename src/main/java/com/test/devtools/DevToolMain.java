package com.test.devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by premsingh on 6/3/18.
 */
@SpringBootApplication
public class DevToolMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Spring Boot basic application");
        SpringApplication.run(DevToolMain.class, args);
    }
}
