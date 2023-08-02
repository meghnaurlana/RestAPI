package com.Task.demo.service;

import com.Task.demo.UserRepo.PostRepository;
import com.Task.demo.dto.Details;
import com.Task.demo.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
     PostRepository postRepository;

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> savePosts(List<Post> post) {
        return postRepository.saveAll(post);
    }

    public List<Post> getPost() {
        return postRepository.findAll();
    }

    public Post getPostById(int id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post updatePost(Post post) {
        Post existingUser = postRepository.findById(post.getId()).orElse(null);
        existingUser.setId(post.getId());
        existingUser.setTitle(post.getTitle());
        existingUser.setBody(post.getBody());
        return postRepository.save(existingUser);
    }


    public String deletePost(int id) {
        postRepository.deleteById(id);
        return "User is deleted " + id;
    }


    public List<Details> getDetails() {
        return postRepository.getDetails();
    }
    public Details getDetailsByID( int id) {
        return postRepository.getDetailsByID(id);
    }
}
