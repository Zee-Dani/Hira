package com.hira.hira.model.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="relationship")
@Entity


public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    // me befriending someone else
    private HiraUser befriend;

    @OneToOne
    // me friend to other people
    private HiraUser friendee;

    private String status;
}
