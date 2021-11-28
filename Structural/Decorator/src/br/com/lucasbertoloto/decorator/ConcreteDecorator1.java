package br.com.lucasbertoloto.decorator;

public class ConcreteDecorator1 extends BaseDecorator {
    public ConcreteDecorator1(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("Executing ConcreteDecoration1 method after the superclass method");
    }
}
