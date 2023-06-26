package com.Task.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommentDto {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
