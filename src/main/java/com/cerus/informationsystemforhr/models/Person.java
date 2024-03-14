package com.cerus.informationsystemforhr.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

@Entity
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Name should not be empty")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Surname should not be empty")
    private String surname;

    @Column(name = "fathername")
    @NotEmpty(message = "Fathername should not be empty")
    private String fathername;

    @Column (name = "age")
    @Min(value = 14, message = "Age should be greater than 14")
    private int age;

    @Column(name = "post")
    @NotEmpty(message = "Post should not be empty")
    private String post;

    @Column(name = "department")
    @NotEmpty(message = "Department should not be empty")
    private String department;

    @Column(name = "skills")
    private String skills;

    @Column(name = "experience")
    private String experience;

    @Column (name = "accepted_at")
    private LocalDateTime acceptedAt;

    public Person() {
    }

    public Person(String name, String surname, String fathername, int age, String post, String department, String skills, String experience, LocalDateTime acceptedAt) {
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.age = age;
        this.post = post;
        this.department = department;
        this.skills = skills;
        this.experience = experience;
        this.acceptedAt = acceptedAt;
    }

    public Person(int id, String name, String surname, String fathername, int age, String post, String department, String skills, String experience, LocalDateTime acceptedAt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.age = age;
        this.post = post;
        this.department = department;
        this.skills = skills;
        this.experience = experience;
        this.acceptedAt = acceptedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public LocalDateTime getAcceptedAt() {
        return acceptedAt;
    }

    public void setAcceptedAt(LocalDateTime acceptedAt) {
        this.acceptedAt = acceptedAt;
    }
}
