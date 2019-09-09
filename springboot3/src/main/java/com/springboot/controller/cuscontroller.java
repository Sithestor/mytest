package com.springboot.controller;

import com.springboot.dao.customerdao;
import com.springboot.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cuscontroller{
        @Autowired
        private customerdao customerdao;

        @RequestMapping("/index")
        public String index(Integer id){
            Customer customer = customerdao.findOne(id);
            System.out.println(customer.getName());
            return "success";
        }

}
