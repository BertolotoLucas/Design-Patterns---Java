package br.com.lucasbertoloto.abstractfactory.model;

public class SquareWithColor extends Shape {

    @Override
    public String toString() {
        return super.toString().replace("Shape","SquareWithColor");
    }
}
