package com.springboot.test01.service;

import com.springboot.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface customerservice {

    public void insert(Customer customer);

}
