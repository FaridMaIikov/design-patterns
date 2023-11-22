package com.example.creational.builder;

public class App {
    public static void main(String[] args) {
        Student student=Student.builder()
                .setName("Ali")
                .setAge(21)
                .setUniversityName("BEU")
                .build();
        System.out.println(student);
    }
}
