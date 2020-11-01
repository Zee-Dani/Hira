package com.hira.hira.repository;

import com.hira.hira.model.post.Comment;
import com.hira.hira.model.post.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {


}
