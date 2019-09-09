package com.springboot.test02.service;

import com.springboot.Customer;
import com.springboot.test02.Mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerserviceimpl implements customerservice {

    @Autowired
    private CustomerMapper customermapper;

    @Override
    public void insert(Customer customer) {
        customermapper.insert(customer.getAge(),customer.getName());
    }
}
