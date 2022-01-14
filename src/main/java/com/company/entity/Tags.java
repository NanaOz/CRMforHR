//package com.company.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table (name = "Tags")
//public class Tags {
//    private long id;
//    private String tag;
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
//    @Column(name = "Tag", nullable = false, length = -1)
//    public String getTag() {
//        return tag;
//    }
//
//    public void setTag(String tag) {
//        this.tag = tag;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Tags tags = (Tags) o;
//        return id == tags.id && Objects.equals(tag, tags.tag);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, tag);
//    }
//}
