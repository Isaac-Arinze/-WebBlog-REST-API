package com.zikan.webblog_restapi.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

import java.util.Set;

@Data
public class PostDto {

//    Title should be empty or null
//    Title should have atleast 3 characters

    private Long id;


    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 3 characters" )
    private String title;

    @NotEmpty
    @Size(min = 2, message = "Post description should have at least 10 characters ")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
