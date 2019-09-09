package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.test01.Mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
