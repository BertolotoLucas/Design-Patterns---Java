package br.com.lucasbertoloto.decorator;

public class ConcreteDecorator2 extends BaseDecorator {
    public ConcreteDecorator2(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("Executing ConcreteDecoration2 method after the superclass method");
    }
}
