package br.com.lucasbertoloto.templatemethod;

public class Application {
    public static void main(String[] args) {
        ConcreteClass1 c1 = new ConcreteClass1();
        ConcreteClass2 c2 = new ConcreteClass2();

        c1.templateMethod();
        c2.templateMethod();
    }
}
