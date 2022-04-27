package com.revature.GoGato.controller;

import com.revature.GoGato.model.Likes;
import com.revature.GoGato.service.LikesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/likes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LikesController {
    private LikesService likesService;
    public LikesController(LikesService likesService){this.likesService=likesService;}

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Likes> findAllLikes(){return likesService.findAllLikes();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Likes createLikes(@RequestBody Likes likes){return likesService.createLikes(likes);}
}
