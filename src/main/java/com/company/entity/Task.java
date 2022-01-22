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

    @Column(name = "date_creation", nullable = false)
    private LocalDate dateCreation;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "executor_id")
    private Employee executor;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "task")
    private String task;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "lid_id")
    private User lid;


    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    private StatusTask statusTask;
    @Lob @Type(type = "org.hibernate.type.DateType")
    @Column(name = "date_deadline", nullable = false)
    private LocalDate dateDeadline;
    @Lob @Type(type = "org.hibernate.type.DateType")
    @Column(name = "date_actual_completion")
    private LocalDate dateActualCompletion;

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

    public StatusTask getStatus() {
        return statusTask;
    }

    public void setStatus(StatusTask statusTask) {
        this.statusTask = statusTask;
    }

    public User getLid() {
        return lid;
    }

    public void setLid(User lid) {
        this.lid = lid;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

     public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getExecutor() {
        return executor;
    }

    public void setExecutor(Employee executor) {
        this.executor = executor;
    }
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @Column(name = "dateofcreation", nullable = false)
//    private LocalDate dateOfCreation;
//
//    @Lob
//    @Column(name = "task", nullable = false)
//    private String task;
//
//    @Lob @Type(type = "org.hibernate.type.TextType")
//    @Column(name = "lid", nullable = false)
//    private String lid;
//
//    @Lob @Type(type = "org.hibernate.type.TextType")
//    @Column(name = "status", nullable = false)
//    private String status;
//
//    @Column(name = "datedeadline", nullable = false)
//    private LocalDate dateDeadline;
//
//    @Column(name = "dateactualcompletion", nullable = false)
//    private LocalDate dateActualCompletion;
//
//    @Lob @Type(type = "org.hibernate.type.TextType")
//    @Column(name = "executor", nullable = false)
//    private String executor;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getExecutor() {
//        return executor;
//    }
//
//    public void setExecutor(String executor) {
//        this.executor = executor;
//    }
//
//    public LocalDate getDateActualCompletion() {
//        return dateActualCompletion;
//    }
//
//    public void setDateActualCompletion(LocalDate dateActualCompletion) {
//        this.dateActualCompletion = dateActualCompletion;
//    }
//
//    public LocalDate getDateDeadline() {
//        return dateDeadline;
//    }
//
//    public void setDateDeadline(LocalDate dateDeadline) {
//        this.dateDeadline = dateDeadline;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getLid() {
//        return lid;
//    }
//
//    public void setLid(String lid) {
//        this.lid = lid;
//    }
//
//    public String getTask() {
//        return task;
//    }
//
//    public void setTask(String task) {
//        this.task = task;
//    }
//
//    public LocalDate getDateOfCreation() {
//        return dateOfCreation;
//    }
//
//    public void setDateOfCreation(LocalDate dateOfCreation) {
//        this.dateOfCreation = dateOfCreation;
//    }
}