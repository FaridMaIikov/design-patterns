package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.model.Rectangle;
import com.example.creational.abstractfactory.model.Shape;
import com.example.creational.abstractfactory.model.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else throw new RuntimeException();
    }
}
