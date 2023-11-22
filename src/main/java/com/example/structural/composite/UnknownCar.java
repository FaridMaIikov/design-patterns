package com.example.structural.composite;

public class UnknownCar implements Car {
    @Override
    public void draw(String color) {
        System.out.println("UnknownCar draw " + color);
    }

    @Override
    public String toString() {
        return "UnknownCar{}";
    }
}
