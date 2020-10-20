package com.hira.hira.model.post;

import com.hira.hira.model.user.HiraUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne
    private HiraUser author;

    private String content;

    private LocalDate  commentCreated;

    private LocalDate  commentUpdated;

    // calling class post
    @ManyToOne
    private Post  post;



}
