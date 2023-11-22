package com.example.creational.abstractfactory.model;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw");
    }
}
