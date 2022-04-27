package com.revature.GoGato.repository;

import com.revature.GoGato.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikesRepository extends JpaRepository<Likes, Integer> {
    Optional<Likes> findAllLikesByuserid(Integer userid);
}