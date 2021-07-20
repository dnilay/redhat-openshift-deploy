package com.example.demo.service;

import com.example.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserService userService;

    @Autowired
    public UserServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userService.createUser(userEntity);
    }

    @Override
    public List<UserEntity> displayCustomer() {
        return userService.displayCustomer();
    }
}
