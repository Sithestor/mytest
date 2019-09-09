package com.springboot.controller;

import com.springboot.dao.customerdao;
import com.springboot.pojo.Customer;

import com.springboot.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class cuscontroller{
        @Autowired
        private customerservice custom;

        @RequestMapping("/serchall")
        public String index(Model model){
            List<Customer> search = custom.search();
            model.addAttribute("users",search);
            return "user";
        }
        @RequestMapping("/save")
        public String save(Customer customer){

            custom.createcustomer(customer);
            return "redirect:serchall";
        }


}
