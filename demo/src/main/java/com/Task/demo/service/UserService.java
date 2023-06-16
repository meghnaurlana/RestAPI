package com.Task.demo.service;

import com.Task.demo.UserRepo.UserRepo;
import com.Task.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
private UserRepo userRepo;
    public User saveUser(User user){
       return userRepo.save(user);

    }
    public List<User> getUser (){
        return userRepo.findAll();
    }
    public String delUser(){
         userRepo.deleteAll();
         return "deleted";
    }
}
