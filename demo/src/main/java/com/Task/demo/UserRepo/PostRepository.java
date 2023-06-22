package com.Task.demo.UserRepo;

import com.Task.demo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    @Query("select s.id,user_id,title,body from user_id s join post i on s.id=i.id")
    List<Post> getPostDetails();
}
