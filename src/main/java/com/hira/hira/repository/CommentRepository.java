package com.hira.hira.repository;

import com.hira.hira.model.post.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository  extends JpaRepository <Comment, Long> {
}
