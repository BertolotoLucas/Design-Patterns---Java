package br.com.lucasbertoloto.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSuperClass implements SuperClass{
    //the pattern begins here, a list of a superclass that execute
    //the methods of the children
    private List<SuperClass> sons = new ArrayList<>();

    @Override
    public void show() {
        for (SuperClass sc: sons) {
            sc.show();
        }
    }

    public void add(SuperClass sc) {
        this.sons.add(sc);
    }
}
