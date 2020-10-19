package com.hira.hira.model.user;


import lombok.Data;

import javax.persistence.*;



@Data
@Table(name="relationship")
@Entity


public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private HiraUser befriend;

    @OneToOne
    private HiraUser friendee;
}
