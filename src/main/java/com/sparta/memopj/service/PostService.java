package com.sparta.memopj.service;

import com.sparta.memopj.dto.PostRequestDto;
import com.sparta.memopj.entity.Post;
import com.sparta.memopj.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Post createPost(PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        postRepository.save(post);
        return post;
    }

    @Transactional(readOnly = true)
    public List<Post> getPosts() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }

    public Long update(Long id, Long password, PostRequestDto requestDto) {
        Post post = postRepository.findById(id, password)
    }
}
