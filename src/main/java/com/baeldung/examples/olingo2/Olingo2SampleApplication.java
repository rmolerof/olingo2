package com.baeldung.examples.olingo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Olingo2SampleApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {        
        SpringApplication.run(Olingo2SampleApplication.class);
    }
}
