package com.example.service.impl;

import com.example.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User selectByPrimaryKey(Integer id);

    int addUser(User user);

    int delUserById(int id);

    List<User> userList(Map<Object, Object> map);
}
