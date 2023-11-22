package com.example.structural.facade;

public class Engine extends Car {
    @Override
    public void start() {
        System.out.println("Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Engine stop");
    }
}
