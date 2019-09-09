package com.springboot.test01.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.Customer;
import com.springboot.test01.Mapper.CustomerMapper;
import com.springboot.test01.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    @Autowired
    private CustomerMapper customerMapper;
    @RequestMapping("/insert")
    public String insert(Customer customer){
        customerMapper.insert(customer.getAge(),customer.getName());

        return "ok";
    }

}
