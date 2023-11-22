package com.example.structural.bridge;


import com.example.structural.bridge.device.Laptop;
import com.example.structural.bridge.device.MusicDevices;

public class App {
    public static void main(String[] args) {
        Music music = new Music("Eminem", "Without Me");

        MusicDevices musicDevices=new Laptop();
        musicDevices.playMusic(music);
    }
}
