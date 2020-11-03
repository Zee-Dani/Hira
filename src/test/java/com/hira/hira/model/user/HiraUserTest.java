package com.hira.hira.model.user;

import com.hira.hira.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HiraUserTest {
    HiraUser myUser, myUser2;

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        myUser = new HiraUser();
        myUser2 = new HiraUser();
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

    @Test
    void findUserById(){
        myUser = userRepository.findById(4L).orElseThrow();
        assertThat("zidani").isEqualTo(myUser.getUsername());
    }

    @Test
    void updateUserDetails(){
        myUser2 = userRepository.findById(3L).orElseThrow();
        myUser2.setFirstname("Victoria");
        userRepository.save(myUser2);
        myUser2 = userRepository.findById(3L).orElseThrow();
        assertThat("Victoria").isEqualTo(myUser2.getFirstname());
    }

    @Test
    void findAllUser(){
        List<HiraUser> allMyUsers = userRepository.findAll();
        for (HiraUser user : allMyUsers){
            System.out.println(user.getUserId() +" "+ user.getUsername());
        }
    }

    @Test
    void deleteUserById(){
        userRepository.deleteById(3L);
        myUser2 = userRepository.findById(3L).orElseThrow();
        assertThat(myUser2).isNull();

    }
}