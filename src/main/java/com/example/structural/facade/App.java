package com.example.structural.facade;

public class App {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.start();
        System.out.println();
        facade.stop();
    }
}
