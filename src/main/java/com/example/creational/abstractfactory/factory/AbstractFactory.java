package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.model.Shape;

public abstract class AbstractFactory {
     public abstract Shape getShape(String shapeType);
}
