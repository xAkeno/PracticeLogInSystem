package com.example.aghhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class AghhhApplication {
    final static Logger log = Logger.getLogger(AghhhApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(AghhhApplication.class, args);
        log.info("Application started");
    }

}
