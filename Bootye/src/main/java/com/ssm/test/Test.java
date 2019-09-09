package com.ssm.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.ssm.controller")
@EnableAutoConfiguration
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }
}
