package br.com.lucasbertoloto.builder;

public class Application {
    //this pattern is used to facilitate to create objects from a class that have a lot of
    //optional or not attributes
    public static void main(String[] args) {
        Class c1 = new Class(true);
        Class c2 = new Class(true,true);
        Class c3 = new Class(true,true,false);
        Class c4 = new Class(true,true,false,true);

        ClassWithBuilder classWithBuilder = new ClassWithBuilder.Builder(true).setAttr2(true).setAttr3(false)
                .setAttr4(true).build();
    }
}
