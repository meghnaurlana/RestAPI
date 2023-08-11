package com.Task.demo.controller;

import com.Task.demo.entity.User;
import com.Task.demo.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @MockBean
    UserService userService;
    @Autowired
    MockMvc mockMvc;

    @Test
    void addUser() throws Exception {
        User user = new User(1, "meghana", 1, ("new post"), ("hello"));
        when(userService.saveUser(user)).thenReturn(user);
        mockMvc.perform(post("/user").contentType(MediaType.APPLICATION_JSON).content(new ObjectMapper().writeValueAsString(user))).andExpect(status().isOk());
    }


    @Test
    void findUser() throws Exception {
        List<User> userList = Arrays.asList(new User(1, "meghana", 1, ("new post"), ("hello")), new User(2, "urlana", 2, ("new posts"), ("good morning")));
        when(userService.getUser()).thenReturn(userList);
        mockMvc.perform(get("/getUser").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$[0].id").value(1));


    }

    @Test
    void getUserById() throws Exception {
        User user = new User(1, "meghana", 1, ("new post"), ("hello"));
        when(userService.getUserById(1)).thenReturn(user);
        mockMvc.perform(get("/getUserByID/{id}", 1).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$[0].id").value(1));
    }

}