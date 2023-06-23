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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

//    @OneToMany( cascade = CascadeType.ALL, mappedBy = "post")
//    private List<Comment> commentList;





}
