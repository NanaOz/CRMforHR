package com.company;

import employer.Employee;
import employer.EmployeeHR;

import java.util.Date;
import java.util.HashMap;

public class Task {
    public Date dateStartTask;  //дата начала задания
    public Date dateEndTask;   //дэдлайн
    public String task;          //задание

    Employee employee;
    EmployeeHR employeeHR; //нужны ли?если наследники от employee
    Candidate candidate;

    public void creatingTask (){}      //создать задачу
}
