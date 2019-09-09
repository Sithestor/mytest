package com.spring.test01.Controller;

import com.spring.Customer;
import com.spring.test01.Mapper.CustomerMapper1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class CustomerController {


    @Autowired
    private CustomerMapper1 customerMapper1;
    @RequestMapping("/insert")
    public String insert(Customer c){

        customerMapper1.insert(c.getAge(),c.getName());
        return "success";
    }
    @RequestMapping("/login")
    public String login(){

        return "index";
    }
}
