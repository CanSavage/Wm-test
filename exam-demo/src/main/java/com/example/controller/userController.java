package com.example.controller;

import com.example.entity.user;
import com.example.service.Impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {
    @Autowired
    userServiceImpl usp;

    @GetMapping("login")
    @ResponseBody
    public List<user> login(String name,String password){
        List<user> list=usp.login(name,password);
        if(list != null){
            System.out.println(list);
        }else {
            System.out.println("none");
        }
        return list;
    };


    @GetMapping("showAll")
    @ResponseBody
    public List<user> showAll(){
        List<user> list=usp.SelectAll();
        if(list != null){
            return list;
        }else {
            list.contains("查询为空");
            return list;
        }

    };


    @GetMapping("insert")
    public String insert(String name,String password){
        user users=new user();users.setName(name);users.setPassword(password);
        System.out.println("1>>>>>>>>>>>>>>>>."+users.toString());
        int temp=usp.addUser(users);
        if(temp == 0){
            return "插入失败";
        }else {

            return "插入成功";
        }

    };

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") int id){
        int temp=usp.deleteUser(id);
        if(temp == 0){
            return "删除失败";
        }else {

            return "删除成功";
        }

    };

    @GetMapping("update")
    @ResponseBody
    public List<user> update(String name,String password){
        user users=new user();users.setName(name);users.setPassword(password);
        System.out.println("2>>>>>>>>>>>>>>>>."+users.toString());
        int temp=usp.updateUser(users);
        if(temp==1){
            return usp.SelectAll();
        }else {
            return null;
        }
    };

}
