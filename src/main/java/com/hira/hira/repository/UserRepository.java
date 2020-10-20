package com.hira.hira.repository;

import com.hira.hira.model.user.HiraUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
public interface UserRepository  extends JpaRepository <HiraUser, Long> {
}
