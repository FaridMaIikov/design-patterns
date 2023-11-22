package com.example.structural.proxy;

public class App {
    public static void main(String[] args) {
        Image image = new ProxyImage("file.pptx");
        image.display();
        image.display();

    }
}

