package com.revature.GoGato.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "posts")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String content;
    private int likes;
//    private LocalDateTime post_time;
    private int userid; // foreign key to user
    private int parentPost; // foreign key to base post



}
