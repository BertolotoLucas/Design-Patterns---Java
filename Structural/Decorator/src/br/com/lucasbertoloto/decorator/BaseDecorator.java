package br.com.lucasbertoloto.decorator;

public class BaseDecorator implements Component {
    protected Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void execute() {
        wrappee.execute();
    }
}
