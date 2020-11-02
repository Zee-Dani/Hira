package com.hira.hira.repository;

import com.hira.hira.model.post.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository <Like , Long> {
}
