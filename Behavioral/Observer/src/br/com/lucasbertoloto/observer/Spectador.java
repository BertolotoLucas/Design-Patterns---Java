package br.com.lucasbertoloto.observer;

public class Spectador implements Observer{
    @Override
    public void reply(String s) {
        System.out.println(s);
    }
}
