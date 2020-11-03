package com.hira.hira.model.user;



// first tell the system that its a spring test i want to run

import com.hira.hira.repository.AddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class AddressTest {
    Address myAddress ;

    @Autowired
    AddressRepository addressRepository;

    @BeforeEach
    void setup(){myAddress = new Address();}

    @Test
    void createAddress(){
        myAddress.setCity("lagos");
        myAddress.setCountry("nambia");
        myAddress.setStreetname("sabo");
        myAddress.setNumber("090123");
        assertThat(addressRepository.save(myAddress)).isNotNull();
    }
}
