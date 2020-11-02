package com.hira.hira.repository;

import com.hira.hira.model.user.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository <Friend,Long> {

}
