package com.Task.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "body")
    private String body;

    @OneToMany(targetEntity = Comment.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private List<Comment> post;

    public Post(int id, String title, String body, int postId, String name, String email, String body1) {
    }

    public Post(int i, String hello, String body) {
    }

    public Post(int id, String hello, String helloWorld, String post) {
    }
}
