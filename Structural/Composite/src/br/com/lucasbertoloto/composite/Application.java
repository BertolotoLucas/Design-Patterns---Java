package br.com.lucasbertoloto.composite;

public class Application {
    public static void main(String[] args) {
        //with this pattern we can deal with a composition of n generics classes

        //Group1 = Son1,Group2
        CompositeSuperClass group1 = new CompositeSuperClass();
        SonClassTypeOne sc1 = new SonClassTypeOne();
        CompositeSuperClass group2 = new CompositeSuperClass();

        group1.add(sc1);
        group1.add(group2);

        //Group2 = Son1,Son2,Group3
        SonClassTypeOne sc2 = new SonClassTypeOne();
        SonClassTypeTwo sc3 = new SonClassTypeTwo();
        CompositeSuperClass group3 = new CompositeSuperClass();

        group2.add(sc2);
        group2.add(sc3);
        group2.add(group3);

        //Group3 = Son1,Son2,Son3
        SonClassTypeOne sc4 = new SonClassTypeOne();
        SonClassTypeTwo sc5 = new SonClassTypeTwo();
        SonClassTypeThree sc6 = new SonClassTypeThree();

        group3.add(sc4);
        group3.add(sc5);
        group3.add(sc6);

        //We can call the method show() of the all groups inside a group
        group1.show();
    }
}
