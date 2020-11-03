package com.hira.hira.model.user;

import com.hira.hira.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HiraUserTest {
    HiraUser myUser;

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        myUser = new HiraUser();
    }

    @Test
    void createUser(){
        myUser.setFirstname("zidani");
        myUser.setLastname("zipya");
        myUser.setUsername("zidani");
        myUser.setEmail("zidani@gmail.com");
        myUser.setPassword("zidani2020");
        myUser.setGender(Gender.FEMALE);
        assertThat(userRepository.save(myUser)).isNotNull();
    }

    @Test
    void createUser1(){
        myUser.setLastname("lilo");
        myUser.setFirstname("lalo");
        myUser.setGender(Gender.MALE);
        myUser.setEmail("zidanitreasure@yahoo.com");
        myUser.setPassword("234OOP");
        myUser.setUsername("welove");
        assertThat(userRepository.save(myUser)).isNotNull();
    }
}