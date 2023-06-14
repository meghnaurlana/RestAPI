package com.Task.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private float salary;

    public User() {
    }

    public User(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
