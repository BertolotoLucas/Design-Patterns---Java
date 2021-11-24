package br.com.lucasbertoloto.abstractfactory.model;

public class ShapeWithColorFactory extends ShapeAbstractFactory {
    public Shape newShape(int i) {
        if (i == 1) {
            return new SquareWithColor();
        } else if (i == 2) {
            return new CircleWithColor();
        } else {
            return null;
        }
    }
}
