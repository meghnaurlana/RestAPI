package com.Task.demo.UserRepo;

import com.Task.demo.dto.CommentDto;
import com.Task.demo.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query("select new com.Task.demo.dto.CommentDto(p.id, c.id, c.name, c.email, c.body) from Post p JOIN p.post c")
    public List<CommentDto> getCommentDetails();
}
