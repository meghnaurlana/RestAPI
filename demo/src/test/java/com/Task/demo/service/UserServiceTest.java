package com.Task.demo.service;

import com.Task.demo.UserRepo.UserRepo;
import com.Task.demo.entity.User;
import jakarta.inject.Inject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceTest {
    @Mock
    private UserRepo userRepo;
    @Autowired
    private UserService userService;
    @Inject
    User user;
    AutoCloseable autoCloseable;


    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        userService = new UserService(userRepo);
        user = new User(1, "Harry");

    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void testSaveUser() {
        mock(User.class);
        mock(UserRepo.class);
        when(userRepo.save(user)).thenReturn(user);
        assertThat(userService.saveUser(user)).isEqualTo("Success");
    }

    @Test
    void saveUsers() {
    }

    @Test
    void getUser() {
    }

    @Test
    void getUserById() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }
}