package com.example.structural.facade;

public class Facade {
    private Key key;
    private Engine engine;

    public Facade() {
        key = new Key();
        engine = new Engine();
    }

    public void start() {
        key.start();
        engine.start();
    }

    public void stop() {
        key.stop();
        engine.stop();
    }
}
