package com.zikan.webblog_restapi.service;

import com.zikan.webblog_restapi.payload.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CommentService {

     CommentDto createComment (Long postId, CommentDto commentDto);

     List <CommentDto> getCommentsByPostId(Long postId);

     CommentDto getCommentById (Long postId, Long commentId);

     CommentDto updateComment(Long postId, long commentId, CommentDto commentRequest);

     void deleteComment(Long postId, Long commentID);

}
