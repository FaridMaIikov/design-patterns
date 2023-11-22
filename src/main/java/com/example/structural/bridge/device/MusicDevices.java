package com.example.structural.bridge.device;

import com.example.structural.bridge.deviceOfListener.DeviceOfListeners;
import com.example.structural.bridge.platform.PlatformsOfMusic;
import com.example.structural.bridge.Music;

public abstract class MusicDevices {
    protected DeviceOfListeners deviceOfListeners;
    protected PlatformsOfMusic platformsOfMusic;

    public MusicDevices() {
    }

    public MusicDevices(DeviceOfListeners deviceOfListeners, PlatformsOfMusic platformsOfMusic) {
        this.deviceOfListeners = deviceOfListeners;
        this.platformsOfMusic = platformsOfMusic;
    }

    public void playMusic(Music music) {
        String voice = platformsOfMusic.playMusic(music);
        deviceOfListeners.playVoice(voice);
    }
}
