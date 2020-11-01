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

    @ManyToOne
    // me befriending someone else
    private HiraUser friendRequestSender;

    @ManyToOne
    // me friend to other people
    private HiraUser friendRequestReceiver;

    private String status;


}
