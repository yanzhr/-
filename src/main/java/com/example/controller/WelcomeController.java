package com.example.controller;

import com.example.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class WelcomeController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String userList(HttpServletRequest request, HttpServletResponse response){
        try {
            System.out.println("hello");
            System.out.println("haha");
            System.out.println("hehe");
            System.out.println("aaaaa");
            System.out.println("bbbbb");
            System.out.println("ccccc");
            System.out.println("ddddd");
            System.out.println("11111");
            System.out.println("22222");
            response.sendRedirect("/user/list");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
