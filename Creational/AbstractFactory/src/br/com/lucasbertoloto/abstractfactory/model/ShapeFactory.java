package br.com.lucasbertoloto.abstractfactory.model;

public class ShapeFactory extends ShapeAbstractFactory{
    public Shape newShape(int i) {
        if (i == 1) {
            return new Square();
        } else if (i == 2) {
            return new Circle();
        } else {
            return null;
        }
    }
}
