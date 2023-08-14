package com.Task.demo.service;

import com.Task.demo.UserRepo.PostRepository;
import com.Task.demo.dto.CommentDto;
import com.Task.demo.entity.Comment;
import com.Task.demo.entity.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class PostServiceTest {
    @Autowired
    PostService postService;

    @MockBean
    PostRepository postRepository;

    @MockBean
    CommentDto commentDto;


    @Test
    void savePostTest() {
        Post post = new Post();
        post.setId(1);
        post.setTitle("hello world");
        post.setBody("new world");
        Comment comment = new Comment();
        comment.setId(1);
        comment.setEmail("meghana@gmail.com");
        comment.setBody("hello");
        comment.setName("urlana");
        post.setPost(Arrays.asList(comment));
        when(postRepository.save(post)).thenReturn(post);
        assertThat(postService.savePost(post)).isEqualTo(post);
    }


    @Test
    void getPost() {
        Comment comment1 = new Comment(1, "urlana", "meghana@gmail.com", "Hello world");
        Comment comment2 = new Comment(2, "Atla", "Atla@gmail.com", "Fav world");
        Comment comment3 = new Comment(3, "Peddinti", "Peddinti@gmail.com", "Beautiful world");
        List<Comment> PostComments = new ArrayList<>();
        PostComments.add(comment1);
        PostComments.add(comment2);
        PostComments.add(comment3);

        Post post1 = new Post(1, "Hello", "hello world");
        Post post2 = new Post(2, "hiii", "New world");
        Post post3 = new Post(3, "hy", "fav world");
        List<Post> list = new ArrayList<Post>();
        list.add(post1);
        list.add(post2);
        list.add(post3);

        when(postRepository.findAll()).thenReturn(list);
        List<Post> usersList = postService.getPost();
        assertEquals(3, usersList.size());

        verify(postRepository, times(1)).findAll();
    }

    @Test
    void getPostById() {

        Comment comment1 = new Comment(1, "urlana", "meghana@gmail.com", "Hello world");
        List<Comment> PostComments = new ArrayList<>();
        PostComments.add(comment1);
        Optional<Post> post1 = Optional.of(new Post(1, "Hello", "hello world", PostComments));
        Post post;
//        when(postRepository.getPostById(1)).thenReturn(post1);
    }

    @Test
    void updatePost() {
    }

    @Test
    void deletePost() {
    }

    @Test
    void getDetails() {
    }

    @Test
    void getDetailsByID() {
    }
}