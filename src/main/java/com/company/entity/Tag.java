package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "Tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "tag", nullable = false)
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
//        Tags tags = (Tags) o;
//        return id == tags.id && Objects.equals(tag, tags.tag);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, tag);
//    }
    }