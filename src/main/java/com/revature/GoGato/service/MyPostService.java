package com.revature.GoGato.service;

import com.revature.GoGato.model.MyPost;
import com.revature.GoGato.repository.MyPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public class MyPostService {

    @Autowired
    MyPostRepository myPostRepository;

    public List<MyPost> getAll(){

        return myPostRepository.findAll();
    }

    public List<MyPost> getByUserId (int userid){

        return myPostRepository.findByUserid(userid);
    }
    public List<MyPost> getByParentId (int parentid){

        return myPostRepository.findByParentid(parentid);
    }

    //post
    public MyPost createPost(MyPost post) {
        return myPostRepository.save(post);
    }


    public void updatePost(MyPost mypost){ myPostRepository.save(mypost); }

    public void deletePost(MyPost mypost){ myPostRepository.deleteById(mypost.getId()); }
}
