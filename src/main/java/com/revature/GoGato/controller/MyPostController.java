package com.revature.GoGato.controller;
import com.revature.GoGato.model.MyPost;
import com.revature.GoGato.service.MyPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class MyPostController {

    @Autowired
    MyPostService myPostService;

    //get
    @GetMapping
    public List<MyPost> getAll(){return myPostService.getAll();}

    @GetMapping("/userid/{userid}")
    public List<MyPost> getAllByUserId(@PathVariable int userid){return myPostService.getByUserId(userid);}

    @GetMapping("/parent/{parentid}")
    public List<MyPost> getAllByParentId(@PathVariable int parentid){return myPostService.getByParentId(parentid);}


    //post
    @PostMapping("/create")
    public void createPostService(@RequestBody MyPost post){
        myPostService.createPost(post);
    }

    //update record
    @PutMapping
    public void updatePost(@RequestBody MyPost temp){ myPostService.updatePost(temp); }

    //delete record
    @DeleteMapping
    public void deletePost(@RequestBody MyPost temp){ myPostService.deletePost(temp); }
}
