package com.springboot.dao;

import com.springboot.pojo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerdao extends JpaRepository<Customer,Integer> {
}
