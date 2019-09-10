package com.demo1.dao;

import com.demo1.pojo.User;

import java.util.List;

public interface UserMapper {

    void adduser(User user);
    List<User> findAll(User user);
}
