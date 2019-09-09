package com.ssm.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ssm")
@SpringBootApplication
public class test1 {

    public static void main(String[] args) {
        SpringApplication.run(test1.class,args);
    }
}
