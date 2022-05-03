package com.revature.GoGato.service;

import com.revature.GoGato.model.Likes;
import com.revature.GoGato.repository.LikesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * This class contains the methods to create, retrieve, update, and delete likes.
 *
 */


@Service
public class LikesService {
    //@Autowired would do this too I have just read somewhere this is more secure
    private final LikesRepository likesRepository;
    public LikesService(LikesRepository likesRepository){this.likesRepository = likesRepository;}//

    /**
     * Method to retrieve all liked posts from the database
     * gets all likes so that it can display if a user has a previous interaction with
     * the post and prevent future issues where users can keep liking nad refreshing the posts
     * @return list of liked posts
     * @author Justin
     */
    public List<Likes> findAllLikes(){return likesRepository.findAll();}


    /**
     * Method to create the relationship between users and posts
     * @author Justin
     */
    public Likes createLikes(Likes likes){return likesRepository.save(likes);}
    // Updates the like_status so that I can refrain from breaking 1NF
    public Likes updateLikes(Likes likes){return likesRepository.save(likes);}

    /**
     * Method to retrieve all likes by the user id
     * currently for future implementations if we get to adding likes on the user profile the logic is there
     * @author Justin
     */
    public List<Likes> findAllLikesByUserId(Integer userid){return likesRepository.findAllLikesByUserid(userid);}

    /**
     * Method to retrieve all likes by like id for updating like status
     * @param id
     * @return *list* of likes by like id
     * @author Justin
     */
    public Optional<Likes> getAllLikesByLikesId(Integer id){return likesRepository.findById(id);}


    /**
     * Method to delete like by id
     * @param id
     * @author Justin
     */
    public void deleteById(Integer id) {likesRepository.deleteById(id);
    }
}
