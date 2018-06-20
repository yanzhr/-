package com.example.service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList(Map<Object, Object> map) {
        return userMapper.userList(map);
    }

    @Override
    public int delUserById(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }
}
