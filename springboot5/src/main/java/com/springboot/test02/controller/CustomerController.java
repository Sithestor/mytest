package com.springboot.test02.controller;

import com.springboot.Customer;
import com.springboot.test02.Mapper.CustomerMapper;
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
