package com.revature.GoGato.controller;

import com.revature.GoGato.model.Likes;
import com.revature.GoGato.service.LikesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * This controller handles requests to create and update a post's likes
 */

@RestController
@RequestMapping("/likes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LikesController {
    private LikesService likesService;

    public LikesController(LikesService likesService) {
        this.likesService = likesService;
    }



    /**
     * Retrieves a list of all posts that have been liked
     * @return a list of liked posts
     * @author Justin
     */
    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Likes> findAllLikes() {
        return likesService.findAllLikes();
    }


    /**
     * Creates like and establishes relationship with user and posts
     * @return a single liked post
     * @author Justin
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Likes createLikes(@RequestBody Likes likes) {
        return likesService.createLikes(likes);
    }


    /**
     * Retrieve liked post by user id
     * @return a single liked post
     * @author Justin
     */
    @GetMapping("/{userid}")
    @ResponseBody
    public  List<Likes> getAllLikesByUserId(@PathVariable Integer userid) {
        return likesService.findAllLikesByUserId(userid);

    }


    /**
     * creates an optional request where if an id is added in a put request
     * then it will put the new like_status where likes id is found
     * @param newLikes the
     * @param id The ID of the like
     * @return updated like
     * @author Justin
     */
    @PutMapping("/{id}")
    Optional<Likes> replacePost(@RequestBody Likes newLikes, @PathVariable Integer id) {

        return likesService.getAllLikesByLikesId(id)
                // creates a map that updates only the like_state in the object
                .map(like_state -> {
                    like_state.setLike_state(newLikes.getLike_state());
                    // actually updates the likes
                    return likesService.updateLikes(like_state);
                });
    }

    /**
     * Deletes a like
     * @param id The ID of the like
     * @author Justin
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){ likesService.deleteById(id); }
}
