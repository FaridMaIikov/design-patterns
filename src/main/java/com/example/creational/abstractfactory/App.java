package com.example.creational.abstractfactory;

import com.example.creational.abstractfactory.factory.AbstractFactory;
import com.example.creational.abstractfactory.factory.FactoryProcedure;
import com.example.creational.abstractfactory.model.Shape;

public class App {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProcedure.getFactory(true);
        Shape shape = factory.getShape("rectangle");
        shape.draw();

    }
}
