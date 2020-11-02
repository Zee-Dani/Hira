package com.hira.hira.repository;

import com.hira.hira.model.user.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository <Video,Long> {
}
