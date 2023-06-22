package com.Task.demo.controller;

import com.Task.demo.entity.Post;
import com.Task.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @PostMapping("/posts")
    public List<Post> addPosts(@RequestBody List<Post> post) {
        return postService.savePosts(post);
    }

    @GetMapping("/getPosts")
    public List<Post> findPost() {
        return postService.getPost();
    }

    @GetMapping("/getPostByID/{id}")
    public Post getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }

    @PutMapping("/updatePost")
    public Post updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }

    @DeleteMapping("/Post/{id}")
    public String deleteByID(@PathVariable int id) {
        return postService.deletePost(id);
    }



    @GetMapping("/post")
    public  List<Post> getPostDetails(){
        return postService.postDetails();
    }
}
