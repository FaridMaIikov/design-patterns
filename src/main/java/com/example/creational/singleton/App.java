package com.example.creational.singleton;

public class App {
    public static void main(String[] args) {
        SingletonPattern obj = SingletonPattern.getInstance();

        obj.check();

    }
}
