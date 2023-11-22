package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.model.RoundedRectangle;
import com.example.creational.abstractfactory.model.RoundedSquare;
import com.example.creational.abstractfactory.model.Shape;


public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("ROUNDED_RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("ROUNDED_SQUARE")) {
            return new RoundedSquare();
        } else throw new RuntimeException("Create RoundedFactory");
    }
}
