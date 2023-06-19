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

    public User getUserByName(String name) {
        return userRepo.findByName(name);
    }

    public User updateUser(User user){
        User existinguser = userRepo.findById(user.getId()).orElse(null);
        existinguser.setId(user.getId());
        existinguser.setName(user.getName());
        existinguser.setSalary(user.getSalary());
        existinguser.setAddress(user.getAddress());
        return userRepo.save(existinguser);
    }
    public String deleteUser(int id) {
         userRepo.deleteById(id);
         return "User is deleted " + id;
    }
}
