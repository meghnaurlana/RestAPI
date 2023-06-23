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

//    @OneToMany( cascade = CascadeType.ALL, mappedBy = "user")
//    private List<Post> postList;

}
