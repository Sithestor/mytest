package com.ssm.controller;

import com.ssm.pojo.Customer;
import com.ssm.service.Custormerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cus")
public class cuscontroller {

    @Autowired
    private  Custormerservice custservice;

    @RequestMapping("/searchAll")
    public String  searchAll(Model model){
        List<Customer> customerList = custservice.searchAll();
            model.addAttribute("list",customerList);
        return "index";
    }
}
