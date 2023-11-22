package com.example.structural.proxy;

public class ProxyImage implements Image {
    String file;
    RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null) {
            System.out.println("created");
            image = new RealImage(file);
        }
        image.display();
    }
}
