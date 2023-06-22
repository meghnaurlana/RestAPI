package com.Task.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Column(name = "userId")
    private int userId;
    @Id
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "body")
    private String body;

}
