package com.ssm.service.impl;

import com.ssm.dao.CustomerMapper;
import com.ssm.pojo.Customer;
import com.ssm.service.Custormerservice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Custormerimpl implements Custormerservice {

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public List<Customer> searchAll() {
      List<Customer> customerList = customerMapper.selectByExample(null);
        return customerList;
    }

}
