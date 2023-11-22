package com.example.structural.composite;

public class SportCar implements Car {
    @Override
    public void draw(String color) {
        System.out.println("SportCar draw " + color);
    }

    @Override
    public String toString() {
        return "SportCar{}";
    }
}
