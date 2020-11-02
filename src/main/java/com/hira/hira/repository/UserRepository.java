package com.hira.hira.repository;

import com.hira.hira.model.user.HiraUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<HiraUser, Long> {
}
