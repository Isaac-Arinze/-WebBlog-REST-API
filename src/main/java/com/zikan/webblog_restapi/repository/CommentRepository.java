package com.zikan.webblog_restapi.repository;

import com.zikan.webblog_restapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository <Comment, Long> {

    List<Comment> findByPostId(Long postId);
}
