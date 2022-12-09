package com.sparta.memopj.controller;

import com.sparta.memopj.dto.PostRequestDto;
import com.sparta.memopj.entity.Post;
import com.sparta.memopj.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @PostMapping("/api/posts")
    public Post createPost(@RequestBody PostRequestDto requestDto) {
        return PostService.createPost(requestDto);
    }

    @GetMapping("/api/posts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    @PutMapping("/api/posts/{id},{password}")
    public Long updatePost(@PathVariable Long id, @PathVariable Long password, @RequestBody PostRequestDto requestDto) {
        return postService.update(id, password, requestDto);
    }
}
