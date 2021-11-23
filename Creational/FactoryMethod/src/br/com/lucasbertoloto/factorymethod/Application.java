package br.com.lucasbertoloto.factorymethod;

import br.com.lucasbertoloto.factorymethod.model.Shape;
import br.com.lucasbertoloto.factorymethod.model.ShapeFactory;
import br.com.lucasbertoloto.factorymethod.model.TypeShape;

public class Application {
    public static void main(String[] args) {
        //this Pattern is util to make the class client (in this case Application) get a specific instance by getting an abstract class
        Shape shape = ShapeFactory.newShape(TypeShape.CIRCLE.getValue());
        Shape shape2 = ShapeFactory.newShape(TypeShape.SQUARE.getValue());
        Shape shape3 = ShapeFactory.newShape(3);
        System.out.println(shape);
        System.out.println(shape2);
        System.out.println(shape3);
    }
}
