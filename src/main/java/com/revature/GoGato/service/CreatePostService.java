package com.revature.GoGato.service;

import com.revature.GoGato.model.MyPost;
import com.revature.GoGato.repository.CreatePostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreatePostService {
    @Autowired
    CreatePostRepository createPostRepository;

    public MyPost createPost(MyPost myPost) {
        return createPostRepository.save(myPost);
    }


}
