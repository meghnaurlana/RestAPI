package com.Task.demo.controller;

import com.Task.demo.dto.Details;
import com.Task.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    // All Post
    @GetMapping("/posts")
    public List<Details> findGetDetails() {
        return postService.getDetails();
    }


    //get post by id
    @GetMapping("/post/{id}")
    Details getDetailsByID(@PathVariable int id){
        return postService.getDetailsByID(id);
    }

}
