package com.Task.demo.UserRepo;

import com.Task.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query("SELECT * FROM userdetails WHERE id=:id")
    User findAll(@Param("id") Integer id);
}
