package com.revature.GoGato.repository;

import com.revature.GoGato.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikesRepository extends JpaRepository<Likes, Integer> {
    //created so if an optional get method is acted the repository knows to get by user id instead of just id
    Optional<Likes> findAllLikesByuserid(Integer userid);
}