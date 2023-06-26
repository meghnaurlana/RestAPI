package com.Task.demo.controller;

import com.Task.demo.UserRepo.PostRepository;
import com.Task.demo.UserRepo.UserRepo;
import com.Task.demo.dto.CommentDto;
import com.Task.demo.dto.Details;
import com.Task.demo.entity.Post;
import com.Task.demo.entity.User;
import com.Task.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepo userRepo;

    @Autowired
    PostRepository postRepository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/users")
    public List<User> addUsers(@RequestBody List<User> user) {
        return userService.saveUsers(user);
    }

    @GetMapping("/getUser")
    public List<User> findUser() {
        return userService.getUser();
    }

    @GetMapping("/getUserByID/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PutMapping("/update")
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteByID(@PathVariable int id) {
        return userService.deleteUser(id);
    }

    @GetMapping("/posts")
    public List<Details> getDetails() {
        return userRepo.getDetails();
    }

    @GetMapping("/comments")
    public List<CommentDto> getCommentDetails() {
        return postRepository.getCommentDetails();
    }

    @GetMapping("/post/{id}")
    public Details getDetailsByID() {
        return userRepo.getDetailsByID();
    }

//    @GetMapping("/post/{id}/comments")
//    public CommentDto getComments() {
//        return userRepo.getComments();
//    }


}


