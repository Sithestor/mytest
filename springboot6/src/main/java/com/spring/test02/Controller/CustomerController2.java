package com.spring.test02.Controller;

import com.spring.Customer;
import com.spring.test02.Mapper.CustomerMapper2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user2")
public class CustomerController2 {

  @Autowired
  private CustomerMapper2 customerMapper2;


    @RequestMapping("/insert2")
    public String insert(Customer c){

        customerMapper2.insert(c.getAge(),c.getName());
        return "success";
    }


    @RequestMapping("/login2")
    public String login(){

        return "index";
    }
}
