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

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public List<User> saveUsers(List<User> user) {
        return userRepo.saveAll(user);
    }

    public List<User> getUser() {
        return userRepo.findAll();
    }

    public User getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    public User updateUser(User user){
        User existingUser = userRepo.findById(user.getId()).orElse(null);
        existingUser.setUserId(user.getUserId());
        existingUser.setId(user.getId());
        existingUser.setTitle(user.getTitle());
        existingUser.setBody(user.getBody());
        return userRepo.save(existingUser);
    }


    public String deleteUser(int id) {
        userRepo.deleteById(id);
        return "User is deleted " + id;
    }
}
