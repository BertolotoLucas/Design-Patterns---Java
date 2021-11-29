package br.com.lucasbertoloto.observer;

public class Application {
    public static void main(String[] args) {
        //this pattern is used to make Observers Classes check if a Subject Class is changed or realized a Method
        //in this example I will simulate the performance of Queen at Live Aid 1985

        Singer singer = new Singer("Freddie Mercury");
        Spectador s1 = new Spectador();
        Spectador s2 = new Spectador();
        Spectador s3 = new Spectador();
        Spectador s4 = new Spectador();
        Spectador s5 = new Spectador();

        singer.registerObserver(s1);
        singer.registerObserver(s2);
        singer.registerObserver(s3);
        singer.registerObserver(s4);
        singer.registerObserver(s5);

        singer.notifyObservers("EEEEEEOOOOOO!");
        singer.notifyObservers("EO!");
        singer.notifyObservers("EEEEEE OEOEOEOEOEO!");
        singer.notifyObservers("EEEEEEEEEEEEEEEEEEEEEEEEEEEOO!");
        singer.notifyObservers("EO!");
        singer.notifyObservers("EO!");
        singer.notifyObservers("All Right!");

    }
}
