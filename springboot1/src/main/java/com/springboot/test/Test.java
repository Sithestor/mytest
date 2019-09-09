package com.springboot.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.springboot")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.springboot.dao")
@EntityScan(basePackages = "com.springboot.pojo")
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }
}
