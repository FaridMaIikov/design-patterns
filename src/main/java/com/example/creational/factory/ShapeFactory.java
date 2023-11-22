package com.example.creational.factory;

public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType) {
        if (shapeType == null) {
            throw new NullPointerException("ShapeTpe enter");
        }
        switch (shapeType) {
            case SQUARE -> {
                return new Square();
            }
            case RECTANGLE -> {
                return new Rectangle();
            }
            default -> throw new NullPointerException();
        }
    }

    enum ShapeType {
        RECTANGLE, SQUARE
    }
}
