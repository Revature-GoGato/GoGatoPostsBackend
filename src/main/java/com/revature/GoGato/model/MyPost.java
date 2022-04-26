package com.revature.GoGato.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "posts")

@Data
public class MyPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String contents;
    private int likes;
    private String post_time;
    private int userid;
    private int parentid;
    private int childid;

    public MyPost(){}

    public int getId() {
        return id;
    }

}
