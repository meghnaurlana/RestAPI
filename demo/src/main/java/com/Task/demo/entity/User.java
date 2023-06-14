package com.Task.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_ADDRESS")
    private String userAddress;


}
