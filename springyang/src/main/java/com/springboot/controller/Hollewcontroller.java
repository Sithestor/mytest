package com.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Hollewcontroller {

    @RequestMapping("/hello")
    public  String index(){
        return "hellow word";
    }

    public static void main(String[] args) {
        SpringApplication.run(Hollewcontroller.class,args);
    }
}
