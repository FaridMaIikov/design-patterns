package com.example.creational.prototype;

public class Car extends Vehicle {
    String name;
    String factory;
    int date;

    @Override
    public Car clone() {
        return (Car) super.clone();
    }

    public Car() {
    }

    public Car(String name, String factory, int date) {
        this.name = name;
        this.factory = factory;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                ", date=" + date +
                '}';
    }
}
