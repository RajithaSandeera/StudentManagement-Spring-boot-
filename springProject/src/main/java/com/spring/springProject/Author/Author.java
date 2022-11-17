package com.spring.springProject.Author;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.spring.springProject.Category.Category;
//import com.spring.springProject.login.Login;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    private String name;

    @ManyToMany
    @JoinTable(name = "author_role",
            joinColumns= @JoinColumn(name="author_id"),
            inverseJoinColumns = @JoinColumn(name="category_id")
    )
    //private Category category;
    private Set<Category> category =new HashSet<>();

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Set<Category> getCategory() {
        return category;
    }


    public void setCategory(Set<Category> category) {
        this.category = category;
    }


}
