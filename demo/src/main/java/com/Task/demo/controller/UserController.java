package com.Task.demo.controller;

import com.Task.demo.entity.User;
import com.Task.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/posts")
    public List<User> addUsers(@RequestBody List<User> user) {
        return userService.saveUsers(user);
    }

    @GetMapping("/post")
    public List<User> findUser() {
        return userService.getUser();
    }

    @GetMapping("/posts/{id}")
    public User addUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/posts/{id}")
    public String deleteByID(@PathVariable int id) {
        return userService.deleteUser(id);
    }


}


