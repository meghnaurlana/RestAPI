package com.Task.demo.UserRepo;

import com.Task.demo.dto.CommentDto;
import com.Task.demo.dto.Details;
import com.Task.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    @Query("select new com.Task.demo.dto.Details(u.id, p.id, p.title, p.body) from User u JOIN u.user p")
    public List<Details> getDetails();

    @Query("select new com.Task.demo.dto.Details(u.id, p.id, p.title, p.body) from User u JOIN u.user p ON u.id=p.id where p.id=1")
    public Details getDetailsByID();

//    public CommentDto getComments();

}
