package com.revature.GoGato.service;

import com.revature.GoGato.model.MyPost;
import com.revature.GoGato.repository.MyPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * This class contains the methods to create, retrieve, update, and delete posts.
 *
 */

@Service
public class MyPostService {

    @Autowired
    MyPostRepository myPostRepository;

    /**
     * Method to retrieve all posts from the database
     * @return list of all posts
     * @author Jacob
     */

    public List<MyPost> getAll(){

        return myPostRepository.findAll();
    }

    /**
     * Method to retrieve all posts from database filtered by userid
     * @param userid The ID of the user
     * @return list of posts
     * @author Jacob
     */

    public List<MyPost> getByUserId (int userid){

        return myPostRepository.findByUserid(userid);
    }

    /**
     * Method to retrieve all posts from database filtered by parentid, which includes existing comments
     * @param parentid The ID of the parent Post
     * @return list of posts
     * @author Jacob
     */
    public List<MyPost> getByParentId (int parentid){

        return myPostRepository.findByParentid(parentid);
    }

    /**
     * Method to create a post
     * @param post The Post object
     * @return saved post
     * @author Nakisha
     */
    public MyPost createPost(MyPost post) {
        return myPostRepository.save(post);
    }

    /**
     * Method to update a post
     * @param mypost The Post object
     * @author Michael
     */
    public void updatePost(MyPost mypost){ myPostRepository.save(mypost); }


    /**
     * Method to delete a post
     * @param mypost The Post object
     * @author Michael
     */
    public void deletePost(MyPost mypost){ myPostRepository.deleteById(mypost.getId()); }
}
