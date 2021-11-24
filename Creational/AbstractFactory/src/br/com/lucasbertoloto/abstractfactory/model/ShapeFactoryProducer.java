package br.com.lucasbertoloto.abstractfactory.model;

public class ShapeFactoryProducer {

    public static ShapeAbstractFactory getFactory(boolean colored) {
        if (colored) {
            return new ShapeWithColorFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
