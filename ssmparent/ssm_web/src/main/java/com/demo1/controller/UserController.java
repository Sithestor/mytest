package com.demo1.controller;

import com.demo1.pojo.User;
import com.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/adduser")
    public String adduser(User user){
        userService.adduser(user);
        return "redirect:findAll";
    }
    @RequestMapping("/findAll")
    public String findAll(Model model){
      List<User> list= userService.findAll();
      model.addAttribute("lists",list);
        System.out.println(list);
        return "Userlist";
    }
}
