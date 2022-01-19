package com.company.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "Post", nullable = false)
    private String post;

//    @Getter
//    @Setter
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "post")
//    private Collection<Employee> employeeColl;



    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Post post1 = (Post) o;
//        return id == post1.id && Objects.equals(post, post1.post);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, post);
//    }
}