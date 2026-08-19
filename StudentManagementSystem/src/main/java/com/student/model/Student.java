package com.student.model;

public class Student {

    private int id;
    private String name;
    private int age;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Constructor without ID
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}