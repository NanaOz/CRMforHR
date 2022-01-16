//package com.company.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table (name = "EmployeeItTag")
//public class EmployeeItTag {
//    private long id;
//    private Long level;
//    private EmployeeIt employeeItByEmployeeItId;
//    private TagsRepository tagsByTagId;
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
//    @Column(name = "Level", nullable = true)
//    public Long getLevel() {
//        return level;
//    }
//
//    public void setLevel(Long level) {
//        this.level = level;
//    }
//
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
//
//    @ManyToOne
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
//    public TagsRepository getTagsByTagId() {
//        return tagsByTagId;
//    }
//
//    public void setTagsByTagId(TagsRepository tagsByTagId) {
//        this.tagsByTagId = tagsByTagId;
//    }
//}
