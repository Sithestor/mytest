package com.demo1.service;

import com.demo1.pojo.User;

import java.util.List;

public interface UserService {
    void adduser(User user);

    List<User> findAll();
}
