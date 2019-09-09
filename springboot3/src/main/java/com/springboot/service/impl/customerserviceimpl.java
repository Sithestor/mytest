package com.springboot.service.impl;

import com.springboot.pojo.Customer;
import com.springboot.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class customerserviceimpl implements customerservice {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void createcustomer(Customer customer) {
        customer.setAge(12);
        customer.setName("wangtao");
        System.out.println("ssss");
        jdbcTemplate.update("INSERT INTO t_customer VALUES(NULL,?,?)",customer.getAge(),customer.getName());
    }
}
