package br.com.lucasbertoloto.observer;

import java.util.HashSet;

public class Singer implements Subject{
    private String name;
    private HashSet<Observer> observers = new HashSet<>();

    public Singer(String name) {
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!(observer == null))
            observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        if (!(observers.isEmpty()))
            if (!(observer == null))
                observers.remove(observer);
    }

    @Override
    public void notifyObservers(String s) {
        System.out.println(this.name + " singing: ");
        sing(s);
        System.out.println("Everybody singing: ");
        for (Observer spectator : observers) {
            spectator.reply(s);
        }
    }

    private void sing(String s) {
        System.out.println(s);
    }
}
