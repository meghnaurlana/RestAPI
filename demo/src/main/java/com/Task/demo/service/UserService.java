package com.Task.demo.service;

import com.Task.demo.UserRepo.UserRepo;
import com.Task.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
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

    public User updateUser(User user) {
        User existingUser = userRepo.findById(user.getId()).orElse(null);
        existingUser.setId(user.getId());
        existingUser.setName(user.getName());
        return userRepo.save(existingUser);
    }

    public String deleteUser(int id) {
        userRepo.deleteById(id);
        return "User is deleted " + id;
    }
}
