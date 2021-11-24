package br.com.lucasbertoloto.abstractfactory.model;

public class CircleWithColor extends Shape {

    @Override
    public String toString() {
        return super.toString().replace("Shape","CircleWithColor");
    }
}
