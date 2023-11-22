package com.example.structural.adapter;

public class Refrigerator implements Things {
    private int volt;

    public Refrigerator() {
        this.volt=220;
    }

    @Override
    public int charger() {
        System.out.println("Refrigerator works");
        return volt;
    }
}
