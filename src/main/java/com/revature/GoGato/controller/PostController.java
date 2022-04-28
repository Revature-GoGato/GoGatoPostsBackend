package com.revature.GoGato.controller;

import com.revature.GoGato.model.MyPost;
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
    public List<MyPost> getAll(){return postService.getAll();}

    @GetMapping("/userid/{userid}")
    public List<MyPost> getAllByUserId(@PathVariable int userid){return postService.getByUserId(userid);}

    @GetMapping("/parent/{parentid}")
    public List<MyPost> getAllByParentId(@PathVariable int parentid){return postService.getByParentId(parentid);}



}
