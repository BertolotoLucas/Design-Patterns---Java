package br.com.lucasbertoloto.decorator;

public class ConcreteComponent implements Component{
    @Override
    public void execute() {
        System.out.println("Executed ConcreteComponent");
    }
}
