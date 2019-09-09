package com.ssm.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Customercontroller {
    @RequestMapping("/index")
    public String searchAll(Map<String,Object> model){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name","xiaohuang");
        map.put("age","12");
        map.put("birthday",new Date().toString());
        model.put("list",map);
        return "index";
    }
}
