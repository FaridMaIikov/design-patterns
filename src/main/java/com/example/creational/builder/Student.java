package com.example.creational.builder;

public class Student {
    String name;
    String surname;
    int age;
    String studentNumber;
    String universityName;

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public Student() {
    }

    public Student(String name, String surname, int age, String studentNumber, String universityName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentNumber = studentNumber;
        this.universityName = universityName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", studentNumber='" + studentNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
