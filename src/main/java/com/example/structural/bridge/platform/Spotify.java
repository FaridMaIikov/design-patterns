package com.example.structural.bridge.platform;

import com.example.structural.bridge.Music;

public class Spotify implements PlatformsOfMusic {
    @Override
    public String playMusic(Music music) {
        System.out.println("Spotify "+ music +" playing music");
        return music.getVoice();
    }
}
