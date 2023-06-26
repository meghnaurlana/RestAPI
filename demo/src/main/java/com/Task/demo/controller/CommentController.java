package com.Task.demo.controller;

import com.Task.demo.entity.Comment;
import com.Task.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/comment")
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @PostMapping("/comments")
    public List<Comment> addComments(@RequestBody List<Comment> comment) {
        return commentService.saveComments(comment);
    }

    @GetMapping("/getComments")
    public List<Comment> findComments() {
        return commentService.getComment();
    }

}