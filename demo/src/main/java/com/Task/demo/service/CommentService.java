package com.Task.demo.service;

import com.Task.demo.UserRepo.CommentRepository;
import com.Task.demo.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> saveComments(List<Comment> comment) {
        return commentRepository.saveAll(comment);
    }

    public List<Comment> getComment() {
        return commentRepository.findAll();
    }
}
