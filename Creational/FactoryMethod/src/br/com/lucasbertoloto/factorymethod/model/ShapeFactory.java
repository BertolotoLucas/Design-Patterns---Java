package br.com.lucasbertoloto.factorymethod.model;

public class ShapeFactory {
    public static Shape newShape(int i) {
        if (i == 1) {
            return new Square();
        } else if (i == 2) {
            return new Circle();
        } else {
            return null;
        }
    }
}
