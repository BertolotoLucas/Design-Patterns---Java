package br.com.lucasbertoloto.abstractfactory.model;

public class Square extends Shape {

    @Override
    public String toString() {
        return super.toString().replace("Shape","Square");
    }
}
