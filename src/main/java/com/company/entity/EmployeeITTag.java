package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "employeeITTag")
public class EmployeeITTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "employeeITid", nullable = false)
    private EmployeeIT employeeIT;

    @ManyToOne(optional = false)
    @JoinColumn(name = "tagId", nullable = false)
    private Tag tag;

    @Column(name = "level")
    private Long level;

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public EmployeeIT getEmployeeIT() {
        return employeeIT;
    }

    public void setEmployeeIT(EmployeeIT employeeIT) {
        this.employeeIT = employeeIT;
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
//        EmployeeItTag that = (EmployeeItTag) o;
//        return id == that.id && Objects.equals(level, that.level);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, level);
//    }
//    /    @ManyToOne
//    @JoinColumn(name = "EmployeeIT_id", referencedColumnName = "Id", nullable = false)
//    public EmployeeIt getEmployeeItByEmployeeItId() {
//        return employeeItByEmployeeItId;
//    }
//
//    public void setEmployeeItByEmployeeItId(EmployeeIt employeeItByEmployeeItId) {
//        this.employeeItByEmployeeItId = employeeItByEmployeeItId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Tag_Id", referencedColumnName = "Id", nullable = false)
//    public TagRepository getTagsByTagId() {
//        return tagsByTagId;
//    }
//
//    public void setTagsByTagId(TagRepository tagsByTagId) {
//        this.tagsByTagId = tagsByTagId;
//    }
}