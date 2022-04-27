package com.revature.GoGato.controller;

import com.revature.GoGato.model.Post;
import com.revature.GoGato.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getAll(){return postService.getAll();}

    @GetMapping("/userid/{userid}")
    public List<Post> getAllByUserId(@PathVariable int userid){return postService.getByUserId(userid);}



}
