package br.com.lucasbertoloto.singleton;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=1000;i++) {
            System.out.println("Catch the instance of SingletonMultiThreadClass: "+SingletonMultiThreadClass.getInstance(i).method());
        }
    }
}
