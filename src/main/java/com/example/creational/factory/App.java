package com.example.creational.factory;

public class App {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(null);
        shape.draw();
    }
}
