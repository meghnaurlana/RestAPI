package com.Task.demo.service;

import com.Task.demo.UserRepo.UserRepo;
import com.Task.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@SpringBootTest
class UserServiceTest {
    @MockBean
    UserRepo userRepo;
    @Autowired
    private UserService userService;

    @Test
    void testSaveUser() {
        User user = new User(1, "meghana", 1, ("new post"), ("hello"));
        when(userRepo.save(user)).thenReturn(user);
        assertThat(userService.saveUser(user)).isEqualTo(user);
    }

    @Test
    void getUserTest() {
        when(userRepo.findAll()).thenReturn(Stream.of(new User(1, "meghana", 1, ("new post"), ("hello")), new User(2, "urlana", 1, ("new post 2"), ("hello 2"))).collect(Collectors.toList()));
        assertThat(userService.getUser().size());
    }


    @Test
    void deleteUserTest() {
        User user = new User(1, "meghana", 1, ("new post"), ("hello"));
        doAnswer(Answers.CALLS_REAL_METHODS).when(userRepo).deleteById(any());
        assertThat(userService.deleteUser(user.getId())).isEqualTo("User is deleted 0");

    }
}