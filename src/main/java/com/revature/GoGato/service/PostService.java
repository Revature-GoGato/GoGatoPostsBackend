package com.revature.GoGato.service;

import com.revature.GoGato.model.Post;
import com.revature.GoGato.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> getAll(){

        return postRepository.findAll();
    }

    public List<Post> getByUserId (int userId){

        return postRepository.findByUserId(userId);
    }
    public List<Post> getByParent (int parent){

        return postRepository.findByParent(parent);
    }

}
