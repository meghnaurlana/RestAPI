package com.Task.demo.UserRepo;

import com.Task.demo.entity.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class UserRepoTest {
    @Autowired
    private UserRepo userRepo;

    User user;

    @BeforeEach
    void setUp() {
        user = new User(1, "Harry");
        userRepo.save(user);

    }

    @AfterEach
    void tearDown() {
        user = null;
        userRepo.deleteAll();
    }
}