package com.Task.demo.controller;

import com.Task.demo.UserRepo.UserRepo;
import com.Task.demo.entity.User;
import com.Task.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/users")
public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/getusers")
    public List<User> findUser(){
        return userService.getUser();
    }
}

