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
            response.sendRedirect("/user/list");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
