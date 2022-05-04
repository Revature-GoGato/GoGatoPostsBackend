package com.revature.GoGato.model;

import lombok.Data;

import javax.persistence.*;

/**
 * This class stores the Likes model
 */

@Entity(name = "likes")
@Data
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private int userid;
    private int postid;
    private int like_state;

}
