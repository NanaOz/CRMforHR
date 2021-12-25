package models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table (name = "Users")
public class User {
    @Column (name = "surname")
    private String surname; //фамилия
    @Column (name = "name")
    private String name; //имя
    @Column (nullable = true, name = "fathersName")
    private String fathersName; //отчество

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column (name = "login")
    private String login;
    @Column (name = "password")
    private String password;
    @Column (name = "email")
    private String email; //почта


    //пока не понятно понадобятся или нет
    @Transient
    private String post; //или перенести в сотрудники и соискатели(как предпологаемую должность)?
    @Transient
    private String skills; //навыки
    @Transient
    private String status; // статус "работает", "уволен", "не работает", "приглашен на собеседование"
    @Transient
    private int numberPhone; //телефон (если будем делать как ссылку для звонка)
    @Transient
    private String сity;//город
    @Transient
    private String education; //образование
    @Transient
    private String workExperience; //стаж, предыдущее место работы


    public User() {


    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
