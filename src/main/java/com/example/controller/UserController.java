package com.example.controller;

import com.alibaba.druid.util.StringUtils;
import com.example.model.User;
import com.example.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add")
    public String add(int id,String name, int age){
        User user = new User();
        if(StringUtils.isEmpty(name)){
            return "姓名不能为空";
        }
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        int result = userService.addUser(user);
        System.out.println(result);
        if(result > 0){
            return "SUCCESS";
        }else{
            return "FAIL";
        }
    }

    @RequestMapping(value = "/get/{id}")
    public User getUserById(@PathVariable int id){
        User user = userService.selectByPrimaryKey(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/del/{id}")
    public String delUserById(@PathVariable int id){
        int result = userService.delUserById(id);
        System.out.println(result);
        return "SUCCESS";
    }

    @RequestMapping(value = "/list")
    public List<User> userList(){
        List<User> userLiset = userService.userList(new HashMap<>());
        return userLiset;
    }
}
