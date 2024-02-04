package com.cerus.informationsystemforhr.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Boss {
    @Id
    @Column(name = "boss_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "boss_name")
    @NotEmpty(message = "Name should not be empty")
    private String name;

    @Column(name = "boss_surname")
    @NotEmpty(message = "Surname should not be empty")
    private String surname;

    @Column(name = "boss_fathername")
    @NotEmpty(message = "Fathername should not be empty")
    private String fathername;

    @Column (name = "boss_age")
    @Min(value = 14, message = "Age should be greater than 14")
    private int age;

    @Column(name = "boss_post")
    @NotEmpty(message = "Post should not be empty")
    private String post;

    @Column(name = "boss_department")
    @NotEmpty(message = "Department should not be empty")
    private String department;

    @Column(name = "boss_skills")
    private String skills;

    @Column(name = "boss_experience")
    private String experience;

    @Column (name = "created_at")
    private LocalDateTime acceptedAt;

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
