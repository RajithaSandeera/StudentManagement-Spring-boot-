package com.spring.springProject.AuthorRegistration;


import com.spring.springProject.Author.Author;

import javax.persistence.*;

@Entity
public class AuthorR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    private String regisnum;

    public AuthorR( ) {


    }
    public AuthorR(Integer id ) {
        this.id = id;

    }

    public AuthorR( String regisnum) {

        this.regisnum = regisnum;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegisnum() {
        return regisnum;
    }

    public void setRegisnum(String regisnum) {
        this.regisnum = regisnum;
    }
}


