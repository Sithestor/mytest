package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.springboot.test01.Mapper","com.spring.test02.Mapper"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
