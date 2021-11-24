package br.com.lucasbertoloto.abstractfactory.model;

public class Circle extends Shape {

    @Override
    public String toString() {
        return super.toString().replace("Shape","Circle");
    }
}
