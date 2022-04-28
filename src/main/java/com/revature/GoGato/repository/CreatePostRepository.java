package com.revature.GoGato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CreatePostRepository extends JpaRepository<Post, Integer>{}
