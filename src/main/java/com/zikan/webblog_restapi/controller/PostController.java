package com.zikan.webblog_restapi.controller;

import com.zikan.webblog_restapi.entity.Post;
import com.zikan.webblog_restapi.payload.PostDto;
import com.zikan.webblog_restapi.payload.PostResponse;
import com.zikan.webblog_restapi.service.PostService;
import com.zikan.webblog_restapi.utils.AppConstants;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService; //injecting an interface not a class to achieve loose coupliing

    public PostController(PostService postService) {
        this.postService = postService;
    }
//    create blog post restful Api
    @PostMapping
    public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }
    @GetMapping
    public PostResponse getAllPosts (
            @RequestParam (value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam (value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam (value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam (value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir

    ){
        return postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById (@PathVariable(name = "id") long id){
        return  ResponseEntity.ok(postService.getPodById(id));
    }
//
//        Update post by Id
    @PutMapping("/{id}")
    public ResponseEntity <PostDto> updatePost (@Valid @RequestBody PostDto postDto, @PathVariable (name = "id") long id){
        PostDto postResponse = postService.updatePost(postDto, id);
        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }

//    delete post Rest API
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable (name = "id") Long id){
        postService.deletePostById(id);

        return new ResponseEntity<>("Post Entity deleted successfully", HttpStatus.OK);



    }
}
