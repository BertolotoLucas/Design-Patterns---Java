package br.com.lucasbertoloto.templatemethod;

public class ConcreteClass2 extends AbstractClass{
    @Override
    protected void method3() {
        System.out.println("Method3 of Concrete Class 2 realized");
        System.out.println("Something different in method 3 of Concrete Class 2, if you want");
    }

    @Override
    protected void method2() {
        System.out.println("Method2 of Concrete Class 2 realized");
    }

    @Override
    protected void method1() {
        System.out.println("Method1 of Concrete Class 2 realized");
    }
}
