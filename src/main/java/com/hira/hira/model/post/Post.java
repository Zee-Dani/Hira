package com.hira.hira.model.post;

import com.hira.hira.model.user.HiraUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private Long id;

    @ManyToOne
    private HiraUser author;

    private String postBody;

    @OneToMany
    private List<Comment> comment;

    private
}
