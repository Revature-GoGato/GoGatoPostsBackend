package com.revature.GoGato.service;

import com.revature.GoGato.model.Likes;
import com.revature.GoGato.repository.LikesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikesService {

    private final LikesRepository likesRepository;
    public LikesService(LikesRepository likesRepository){this.likesRepository = likesRepository;}

    public List<Likes> findAllLikes(){return likesRepository.findAll();}

    public Likes createLikes(Likes likes){return likesRepository.save(likes);}
}
