package com.cerus.informationsystemforhr.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

@Entity
public class Subordinate {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "subordinate_name")
    @NotEmpty(message = "Name should not be empty")
    private String name;

    @Column(name = "subordinate_surname")
    @NotEmpty(message = "Surname should not be empty")
    private String surname;

    @Column(name = "subordinate_fathername")
    @NotEmpty(message = "Fathername should not be empty")
    private String fathername;

    @Column (name = "subordinate_age")
    @Min(value = 14, message = "Age should be greater than 14")
    private int age;

    @Column(name = "subordinate_post")
    @NotEmpty(message = "Post should not be empty")
    private String post;

    @Column(name = "subordinate_department")
    @NotEmpty(message = "Department should not be empty")
    private String department;

    @Column(name = "subordinate_skills")
    private String skills;

    @Column(name = "subordinate_experience")
    private String experience;

    @Column (name = "accepted_at")
    private LocalDateTime acceptedAt;

    @ManyToOne
    @JoinColumn(name = "boss_id", referencedColumnName = "id")
    private Boss boss;

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

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
