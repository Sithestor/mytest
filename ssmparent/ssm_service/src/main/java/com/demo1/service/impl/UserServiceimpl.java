package com.demo1.service.impl;

import com.demo1.dao.UserMapper;
import com.demo1.pojo.User;
import com.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void adduser(User user) {
        userMapper.adduser(user);
    }

    @Override
    public List<User> findAll() {
        List<User> list = userMapper.findAll(null);
        return list;
    }
}
