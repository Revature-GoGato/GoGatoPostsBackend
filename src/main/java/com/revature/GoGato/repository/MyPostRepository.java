package com.revature.GoGato.repository;

import com.revature.GoGato.model.MyPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This interface extends the JpaRepository in order to implement CRUD methods.
 */

@Repository
public interface MyPostRepository extends JpaRepository<MyPost, Integer> {
    List<MyPost> findByUserid(int userid);

    List<MyPost> findByParentid(int parentid);
}
