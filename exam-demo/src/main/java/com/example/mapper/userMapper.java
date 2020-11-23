package com.example.mapper;

import com.example.entity.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userMapper {

    @Select("select * from user where name= #{name} and password=#{password}")
    List<user> login(@Param("name") String name,@Param("password") String password);

    @Select("select * from user")
    List<user> SelectAll();

    @Insert("insert into user(name,password) value(name=#{name},password=#{password})")
    int addUser(user users);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);

    @Update("update user(name,password) set(name=#{name},password=#{password}) where id=#{id}")
    int updateUser(user users);
}
