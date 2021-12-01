package br.com.lucasbertoloto.templatemethod;

public abstract class AbstractClass {
    public void templateMethod(){
        method1();
        method2();
        method3();
    }

    protected abstract void method3();

    protected abstract void method2();

    protected abstract void method1();
}
