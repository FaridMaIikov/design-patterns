package com.example.structural.adapter;

public class Socket {
    public void giveElectricity(Things things) {
        int volt = things.charger();
        System.out.println(volt + "V is supplied from the socket");
    }
}
