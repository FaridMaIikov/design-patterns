package com.example.structural.adapter;

public class Oven implements Things {
    private int volt;

    public Oven() {
        this.volt = 220;
    }

    @Override
    public int charger() {
        System.out.println("Oven works");
        return volt;
    }
}
