package com.hira.hira.model.post;

import com.hira.hira.model.user.HiraUser;
import com.hira.hira.model.user.Image;
import com.hira.hira.model.user.Video;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
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

    private String  postContent;

    private LocalDate postCreated;

    private LocalDate postUpdated;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    // one post to many comments because a post   will have a list of comments
    private List<Comment> comment;

    @OneToMany(mappedBy = "post" , cascade = CascadeType.ALL)
    private  List<Image> image;

    @OneToMany(mappedBy = "post" , cascade = CascadeType.ALL)
    private List<Video> video;

    @OneToMany(mappedBy = "post" , cascade = CascadeType.ALL)
    private  List<Like> likes;


}
