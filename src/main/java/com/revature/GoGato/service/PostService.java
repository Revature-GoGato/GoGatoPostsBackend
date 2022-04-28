package com.revature.GoGato.service;

import com.revature.GoGato.model.MyPost;
import com.revature.GoGato.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<MyPost> getAll(){

        return postRepository.findAll();
    }

    public List<MyPost> getByUserId (int userId){

        return postRepository.findByUserId(userId);
    }
    public List<MyPost> getByParentId (int parentid){

        return postRepository.findByParentId(parentid);
    }

}
