package com.springboot.service;

import com.springboot.pojo.Customer;

import java.util.List;

public interface customerservice {

    void createcustomer(Customer customer);

    List<Customer> search();
}
