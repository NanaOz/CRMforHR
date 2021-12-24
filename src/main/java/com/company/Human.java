package com.company;

public abstract class Human {

    private String surname; //фамилия
    private String name; //имя
    private String fathersName; //отчество
    private int id;
    private String post; //или перенести в сотрудники и соискатели(как предпологаемую должность)?
    private String skills; //навыки
    private String status; // статус "работает", "уволен", "не работает", "приглашен на собеседование"
    private int numberPhone; //телефон (если будем делать как ссылку для звонка)

    //пока не понятно понадобятся или нет
    private String сity;//город
    private String email; //почта
    private String education; //образование
    private String workExperience; //стаж, предыдущее место работы


    public Human() {


    }

}
