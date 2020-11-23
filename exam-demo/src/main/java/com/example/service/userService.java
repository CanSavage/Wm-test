package com.example.service;

import com.example.entity.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface userService {
    //登录
    List<user> login(String name,String password);
    //查询所有
    List<user> SelectAll();


    //添加
    int addUser(user users);
    //
    int deleteUser(int id);

    int updateUser(user users);
}
