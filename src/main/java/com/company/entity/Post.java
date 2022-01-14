//package com.company.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table (name = "Post")
//public class Post {
//    private long id;
//    private String post;
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "Id", nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "Post", nullable = false, length = -1)
//    public String getPost() {
//        return post;
//    }
//
//    public void setPost(String post) {
//        this.post = post;
//    }
//
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
//}
