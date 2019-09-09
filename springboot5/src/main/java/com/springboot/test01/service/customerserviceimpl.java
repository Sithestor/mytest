package com.springboot.test01.service;

import com.springboot.Customer;
import com.springboot.test01.Mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerserviceimpl implements  customerservice{

    @Autowired
    private CustomerMapper customermapper;

    @Override
    public void insert(Customer customer) {
        customermapper.insert(customer.getAge(),customer.getName());
    }
}
