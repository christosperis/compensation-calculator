package com.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class IacsApp {

    public static void main(String[] args) {
        new SpringApplication(IacsApp.class).run(args);
    }

}
