package com.example.structural.facade;

public class Key extends Car{
    @Override
    public void start() {
        System.out.println("Key opened");
    }

    @Override
    public void stop() {
        System.out.println("Key closed");
    }
}
