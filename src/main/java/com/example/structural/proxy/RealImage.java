package com.example.structural.proxy;

public class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
        load(file);
    }

    public void load(String file) {
        System.out.println("file load " + file);
    }

    @Override
    public void display() {
        System.out.println("present " + file);
    }
}
