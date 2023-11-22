package com.example.creational.singleton;

public class SingletonPattern {
    private static SingletonPattern instance;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }

    public void check() {
        System.out.println("Hello World");
    }
}
