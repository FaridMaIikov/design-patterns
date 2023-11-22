package com.example.creational.builder;

public class StudentBuilder {
    String name;
    String surname;
    int age;
    String studentNumber;
    String universityName;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
        return this;
    }

    public StudentBuilder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }
    public Student build(){
        return new Student(this.name,this.surname,this.age,this.studentNumber,this.universityName);
    }
}
