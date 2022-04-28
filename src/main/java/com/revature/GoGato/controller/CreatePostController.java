package com.revature.GoGato.controller;

import com.revature.GoGato.model.MyPost;
import com.revature.GoGato.service.CreatePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class CreatePostController {

    @Autowired
    CreatePostService createPostService;



    @PostMapping("/create")
    public void createPostService(@RequestBody MyPost myPost){
        createPostService.createPost(myPost);
    }

}
