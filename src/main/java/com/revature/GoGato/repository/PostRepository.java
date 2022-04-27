package com.revature.GoGato.repository;

import com.revature.GoGato.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {


    List<Post> findByUserId(int userId);

    List<Post> findByParent(int parent);

}
