package com.example.service.Impl;

import com.example.entity.user;
import com.example.mapper.userMapper;
import com.example.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class userServiceImpl implements userService {

    @Autowired
    userMapper userMapper;

    @Override
    public List<user> login(String name,String password) {
        return userMapper.login(name,password);
    }

    @Override
    public List<user> SelectAll() {
        return userMapper.SelectAll();
    }

    @Override
    public int addUser(user users) {
        return userMapper.addUser(users);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(user users) {
        return userMapper.updateUser(users);
    }
}
