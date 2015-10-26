package com.WSschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class WSschoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(WSschoolApplication.class, args);
    }
}
