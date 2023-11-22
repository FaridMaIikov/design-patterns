package com.example.creational.prototype;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Camry");
        car.setFactory("Toyota");
        car.setDate(2021);

        System.out.println(car);

        Car c2 = car.clone();
        System.out.println(c2);

    }

    public static Long calculateDate(Date start, Date stop) {
        long b = 1;
        long time = (start.getTime() / b) - (stop.getTime() / b);
        return time;
    }
}
