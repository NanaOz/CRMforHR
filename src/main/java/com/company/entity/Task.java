package com.company.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "dateofcreation", nullable = false)
    private LocalDate dateOfCreation;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "task", nullable = false)
    private String task;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "lid", nullable = false)
    private String lid;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "datedeadline", nullable = false)
    private LocalDate dateDeadline;

    @Column(name = "dateactualcompletion", nullable = false)
    private LocalDate dateActualCompletion;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "executor", nullable = false)
    private String executor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public LocalDate getDateActualCompletion() {
        return dateActualCompletion;
    }

    public void setDateActualCompletion(LocalDate dateActualCompletion) {
        this.dateActualCompletion = dateActualCompletion;
    }

    public LocalDate getDateDeadline() {
        return dateDeadline;
    }

    public void setDateDeadline(LocalDate dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}