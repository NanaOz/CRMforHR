package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "tag", nullable = false)
    private String tag;

    @Column(name = "criterion")
    private Long criterion;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "candidate_tag",
            joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "candidate_id")
    )
    private List<Candidate> candidates;

    public Long getCriterion() {
        return criterion;
    }

    public void setCriterion(Long criterion) {
        this.criterion = criterion;
    }

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