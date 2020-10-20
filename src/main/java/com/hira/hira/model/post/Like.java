package com.hira.hira.model.post;


import com.hira.hira.model.post.Choice;
import com.hira.hira.model.post.Post;
import com.hira.hira.model.user.HiraUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private HiraUser author;

    @ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Post post;

    @Enumerated(EnumType.STRING)
    private Choice likeValue;

}

