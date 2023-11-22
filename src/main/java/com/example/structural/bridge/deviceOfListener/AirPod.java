package com.example.structural.bridge.deviceOfListener;

public class AirPod implements DeviceOfListeners{
    @Override
    public void playVoice(String voice) {
        System.out.println("Speaker is making sound->"+voice);
    }
}
