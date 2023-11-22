package com.example.structural.bridge.device;

import com.example.structural.bridge.Music;
import com.example.structural.bridge.deviceOfListener.AirPod;
import com.example.structural.bridge.platform.Spotify;

public class Laptop extends MusicDevices {
    public Laptop() {
        System.out.println("Laptop working");
        deviceOfListeners = new AirPod();
        platformsOfMusic = new Spotify();
    }

    @Override
    public void playMusic(Music music) {
        super.playMusic(music);
        System.out.println("Laptop class");
    }
}
