package br.com.lucasbertoloto.singleton;

public class Application {
    public static void main(String[] args) {
        SingletonClass cls = SingletonClass.getInstance();
        System.out.println(cls.method());

        ThreadClass threadClass1 = new ThreadClass();
        ThreadClass threadClass2 = new ThreadClass();
        ThreadClass threadClass3 = new ThreadClass();
        ThreadClass threadClass4 = new ThreadClass();
        ThreadClass threadClass5 = new ThreadClass();

        threadClass1.start();
        threadClass2.start();
        threadClass3.start();
        threadClass4.start();
        threadClass5.start();
    }
}
