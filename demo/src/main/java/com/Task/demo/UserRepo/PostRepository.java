package com.Task.demo.UserRepo;

import com.Task.demo.entity.Post;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
//    @Query(value= "SELECT s.id,title,body FROM username s INNER JOIN post i ON s.id=i.id")
//    List<Post[]> getPostDetails();
}
