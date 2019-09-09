package com.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.springboot")
@EnableAutoConfiguration
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }
}
