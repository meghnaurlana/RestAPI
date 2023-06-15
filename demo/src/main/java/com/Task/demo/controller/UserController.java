package com.Task.demo.controller;

import com.Task.demo.entity.User;
import com.Task.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

//    @PostMapping("/addUser")
//    public User adduser(@RequestBody User user){
//        return service.saveUser(user);
//    }
//    public List<User> adduser(@RequestBody List <User> users){
//        return service.saveUsers(users);
//    }

    @GetMapping("/user")
//    public List<User> findAllUser(){
//        return service.getUser();
//}
    public User findAllUser(@PathVariable("id") Integer id)
    {

        return service.getUser(id);
    }
}
