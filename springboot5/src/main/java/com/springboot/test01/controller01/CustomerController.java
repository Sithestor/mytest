package com.springboot.test01.controller01;

import com.springboot.Customer;
import com.springboot.test01.Mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CustomerController {


    @Autowired
    private CustomerMapper customerMapper;


    @RequestMapping("/insert")
    public String insert(Customer customer){
        customerMapper.insert(customer.getAge(),customer.getName());

        return "ok";
    }

}
