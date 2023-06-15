package com.zikan.webblog_restapi.service;

import com.zikan.webblog_restapi.payload.PostDto;
import com.zikan.webblog_restapi.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPodById (Long id);

    PostDto updatePost (PostDto postDto, Long id);

    void deletePostById(Long id);
}
