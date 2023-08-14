package com.Task.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "username")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = Post.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<Post> user;

    public User(int i, String meghana, int i1, String s, String hello) {
    }

    public User(int i, String meghana) {
    }
}
