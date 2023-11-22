package com.example.structural.adapter;

public class Samsung implements Phone {
    private int volt;

    public Samsung() {
        this.volt = 5;
    }

    @Override
    public int charge() {
        System.out.println("Samsung works");
        return volt;
    }
}
