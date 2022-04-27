package com.revature.GoGato.controller;

import com.revature.GoGato.model.Likes;
import com.revature.GoGato.service.LikesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/likes")
// using this so that I can communicate with my other computer to send requests into the backend
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LikesController {
    private LikesService likesService;

    public LikesController(LikesService likesService) {
        this.likesService = likesService;
    }

    @GetMapping
    // for future use if we end up adding in the liked posts onto the user profile the mapping is already set up
    @ResponseStatus(HttpStatus.FOUND)
    public List<Likes> findAllLikes() {
        return likesService.findAllLikes();
    }

    @PostMapping
    // creates relationship with user and posts
    @ResponseStatus(HttpStatus.CREATED)
    public Likes createLikes(@RequestBody Likes likes) {
        return likesService.createLikes(likes);
    }
    // gets likes by user id so that on front end when pulling up posts it will check if the user has a relationship with the post already
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<Likes> getAllLikesByUserId(@PathVariable Integer userid) {
        return likesService.getLikesByUserId(userid);
    }

    @PutMapping("/{id}")
        // creates an optional request where if an id is added in a put request
        //then it will put the new like_status where likes id is found
    Optional<Likes> replacePost(@RequestBody Likes newLikes, @PathVariable Integer id) {

        return likesService.getAllLikesByLikesId(id)
                // creates a map that updates only the like_state in the object
                .map(like_state -> {
                    like_state.setLike_state(newLikes.getLike_state());
                    // actually updates the likes
                    return likesService.updateLikes(like_state);
                });
    }
}
