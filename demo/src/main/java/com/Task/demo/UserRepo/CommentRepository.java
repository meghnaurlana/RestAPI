package com.Task.demo.UserRepo;

import com.Task.demo.dto.CommentDto;
import com.Task.demo.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query("select new com.Task.demo.dto.CommentDto(p.id, c.id, c.name, c.email, c.body) from Post p JOIN p.post c where p.id =:id")
    public List<CommentDto>getCommentDetailsBYID(@Param("id") Integer id);

    @Query("select new com.Task.demo.dto.CommentDto(p.id, c.id, c.name, c.email, c.body) from Post p JOIN p.post c")
    public List<CommentDto> getCommentDetails();
}
