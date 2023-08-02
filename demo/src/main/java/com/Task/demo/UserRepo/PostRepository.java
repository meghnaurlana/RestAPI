package com.Task.demo.UserRepo;

import com.Task.demo.dto.CommentDto;
import com.Task.demo.dto.Details;
import com.Task.demo.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    @Query("select new com.Task.demo.dto.Details(u.id, p.id, p.title, p.body) from User u JOIN u.user p")
    public List<Details> getDetails();

    @Query("select new com.Task.demo.dto.Details(u.id, p.id, p.title, p.body) from User u JOIN u.user p where p.id=:id")
    public Details getDetailsByID(@Param("id") Integer id);
}
