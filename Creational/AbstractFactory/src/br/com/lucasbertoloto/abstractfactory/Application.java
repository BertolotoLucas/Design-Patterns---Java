package br.com.lucasbertoloto.abstractfactory;

import br.com.lucasbertoloto.abstractfactory.model.*;

public class Application {
    public static void main(String[] args) {
        //this Pattern is util to make the class client (in this case Application) get a specific instance by getting an abstract class
        ShapeAbstractFactory factory = new ShapeFactory();
        ShapeAbstractFactory factory2 = new ShapeWithColorFactory();

        Shape shape = factory.newShape(TypeShape.CIRCLE.getValue());
        Shape shape2 = factory.newShape(TypeShape.SQUARE.getValue());
        Shape shape3 = factory.newShape(3);
        System.out.println(shape);
        System.out.println(shape2);
        System.out.println(shape3);

        shape = factory2.newShape(TypeShape.CIRCLE.getValue());
        shape2 = factory2.newShape(TypeShape.SQUARE.getValue());
        shape3 = factory2.newShape(3);
        System.out.println(shape);
        System.out.println(shape2);
        System.out.println(shape3);
    }
}
