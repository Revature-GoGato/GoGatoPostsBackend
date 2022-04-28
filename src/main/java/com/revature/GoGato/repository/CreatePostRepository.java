package com.revature.GoGato.repository;

import com.revature.GoGato.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CreatePostRepository extends JpaRepository<Post, Integer>{}
