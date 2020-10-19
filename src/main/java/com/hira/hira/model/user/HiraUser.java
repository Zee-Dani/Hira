package com.hira.hira.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hira.hira.model.post.Post;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity

@Table(name= "hira_user")


public class HiraUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(nullable=false)
    private String firstname;

    @Column(nullable=false)
    private String lastname;

    private String  username;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String phoneNumber;

    @OneToOne
    private Address address;

    @Column(nullable = false)
    @JsonIgnore
    @ToString.Exclude

    private String password;

    private Date dateOfBirth;

    private String profileImage;

    @OneToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    private List<Image> allImages;

    private String bannerImage;

    private Video video;
    private List<Friend> friends;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "author",cascade=CascadeType.ALL)
    private List<Post> posts;


}
