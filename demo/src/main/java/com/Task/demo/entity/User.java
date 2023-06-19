package com.Task.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Column(name = "userId")
    private int userId;

    @Id
    private int id;


    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;


}
