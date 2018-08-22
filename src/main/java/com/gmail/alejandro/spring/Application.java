package com.gmail.alejandro.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;

import modelo.HelloWorld;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
@ImportResource("Beans.xml")
public class Application {

    public static void main(String[] args) {
        AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(Application.class, args);
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }

}
