package com.revature.GoGato.controller;

import com.revature.GoGato.model.Likes;
import com.revature.GoGato.service.LikesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/likes")
@CrossOrigin(origins = "*", allowedHeaders = "*") // using this so that I can communicate with my other computer to send requests into the backend
public class LikesController {
    private LikesService likesService;

    public LikesController(LikesService likesService) {
        this.likesService = likesService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND) // for future use if we end up adding in the liked posts onto the user profile the mapping is already set up
    public List<Likes> findAllLikes() {
        return likesService.findAllLikes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // creates relationship with user and posts
    public Likes createLikes(@RequestBody Likes likes) {
        return likesService.createLikes(likes);
    }

    @GetMapping("/{id}") // gets likes by user id so that on front end when pulling up posts it will check if the user has a relationship with the post already
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<Likes> getAllLikesByUserId(@PathVariable Integer userid) {
        return likesService.getLikesByUserId(userid);
    }

    @PutMapping("/{id}")
    Optional<Likes> replacePost(@RequestBody Likes newLikes, @PathVariable Integer id) { // creates an optional request where if an id is added in a put request
        //then it will put the new like_status where likes id is found
        return likesService.getAllLikesByLikesId(id)
                .map(like_state -> { // creates a map that updates only the like_state in the object
                    like_state.setLike_state(newLikes.getLike_state());
                    return likesService.updateLikes(like_state); // actually updates the likes
                });
    }
}
