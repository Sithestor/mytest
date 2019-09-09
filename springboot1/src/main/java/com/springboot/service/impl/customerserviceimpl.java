package com.springboot.service.impl;

import com.springboot.dao.customerdao;
import com.springboot.pojo.Customer;
import com.springboot.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerserviceimpl implements customerservice {



    @Autowired
    private customerdao omerdao;

    public void createcustomer(Customer customer) {
        omerdao.save(customer);

    }
    public List<Customer> search(){
        List<Customer> omerdaoAll = omerdao.findAll();

        return omerdaoAll;
    }

}
