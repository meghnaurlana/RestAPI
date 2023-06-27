package com.Task.demo.controller;

import com.Task.demo.UserRepo.UserRepo;
import com.Task.demo.dto.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CommentController {

    @Autowired
    UserRepo userRepo;

    //All comments
    @GetMapping("/comments")
    public List<CommentDto> getCommentDetails() {
        return userRepo.getCommentDetails();
    }

    //postId  with comment
    @GetMapping("posts/{id}/comments")
    public List<CommentDto> getCommentsInfoById(@PathVariable int id) {
        return userRepo.getCommentDetails(id);
    }
}
