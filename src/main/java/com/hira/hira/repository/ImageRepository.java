package com.hira.hira.repository;

import com.hira.hira.model.user.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository <Image, Long> {


}
