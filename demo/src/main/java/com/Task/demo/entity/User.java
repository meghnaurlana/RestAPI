package com.Task.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private int id;

    @Column(name = "name")
    private String name;

}
