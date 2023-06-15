package com.zikan.webblog_restapi.repository;

import com.zikan.webblog_restapi.entity.Post;
import com.zikan.webblog_restapi.payload.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository <Post, Long> {

   }
