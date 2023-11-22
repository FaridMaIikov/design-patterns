package com.example.structural.composite;

public class App {
    public static void main(String[] args) {
        SportCar bmw = new SportCar();

        UnknownCar unknownCar = new UnknownCar();

        Drawing drawing = new Drawing();
        drawing.addList(bmw);
        drawing.addList(unknownCar);
        drawing.draw("yellow");

        System.out.println(drawing.getCars());
    }
}
