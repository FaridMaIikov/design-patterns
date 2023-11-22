package com.example.structural.bridge;

public class Music {
    private String musicName;
    private String voice;

    public Music(String musicName, String voice) {
        this.musicName = musicName;
        this.voice = voice;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return musicName;
    }
}
