package com.revature.GoGato.repository;

import com.revature.GoGato.model.MyPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<MyPost, Integer> {


    List<MyPost> findByUserId(int userId);

    List<MyPost> findByParentId(int parentid);

}
