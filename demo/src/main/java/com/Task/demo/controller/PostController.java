package com.Task.demo.controller;

import com.Task.demo.UserRepo.UserRepo;
import com.Task.demo.dto.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    UserRepo userRepo;

    // All Post
    @GetMapping("/posts")
    public List<Details> getDetails() {
        return userRepo.getDetails();
    }

    //get post by id
    @GetMapping("/post/{id}")
    public Details getDetailsByID(@PathVariable int id) {
        return userRepo.getDetailsByID(id);
    }

}
