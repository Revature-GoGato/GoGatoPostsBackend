package com.revature.GoGato.controller;
import com.revature.GoGato.model.MyPost;
import com.revature.GoGato.service.MyPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This controller handles requests to create, retrieve, update, and delete User's posts
 */

@RestController
@RequestMapping("/post")
public class MyPostController {

    @Autowired
    MyPostService myPostService;

    /**
     * Retrieve a list of all posts created by currentUser
     * @return a list of posts
     * @author Jacob
     */
    @GetMapping
    public List<MyPost> getAll(){return myPostService.getAll();}

    /**
     * Retrieve all posts created by userid
     * @param userid
     * @return a list of posts
     * @author Jacob
     */
    @GetMapping("/userid/{userid}")
    public List<MyPost> getAllByUserId(@PathVariable int userid){return myPostService.getByUserId(userid);}

    /**
     * Retrieve all posts with parentid as a foreign key, all comments underneath of posts
     * @param parentid
     * @return a list of comments
     * @author Jacob
     */
    @GetMapping("/parent/{parentid}")
    public List<MyPost> getAllByParentId(@PathVariable int parentid){return myPostService.getByParentId(parentid);}


    /**
     * Create a post
     * @param post
     * @author Nakisha
     */
    @PostMapping("/create")
    public void createPostService(@RequestBody MyPost post){
        myPostService.createPost(post);
    }

    /**
     * Update a post
     * @param temp
     * @author Michael
     */
    @PutMapping
    public void updatePost(@RequestBody MyPost temp){ myPostService.updatePost(temp); }

    /**
     * Delete a post
     * @param temp
     * @author Michael
     */
    @DeleteMapping
    public void deletePost(@RequestBody MyPost temp){ myPostService.deletePost(temp); }
}
