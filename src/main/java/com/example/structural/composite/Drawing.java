package com.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Car {
    List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public void draw(String color) {
        for (Car car : cars) {
            car.draw(color);
        }
    }

    public void addList(Car s) {
        this.cars.add(s);
    }

    public void clear() {
        cars.clear();
    }
}
