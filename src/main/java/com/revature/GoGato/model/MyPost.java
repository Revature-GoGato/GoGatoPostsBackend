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
    private int userid;
    private int parent_post;

    public MyPost(){}

}
