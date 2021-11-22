package br.com.lucasbertoloto.singleton;

//This pattern is usable to create an only instance in multi thread environment
public class SingletonMultiThreadClass {
    private static SingletonMultiThreadClass singletonMultiThreadClass;
    private static int testNumber; // It's just to test if this number changes with another call of getInstance()

    private SingletonMultiThreadClass() {}

    public static SingletonMultiThreadClass getInstance(int i) {
        if (singletonMultiThreadClass == null) {
            synchronized (SingletonClass.class) { //synchronized helps us to lead with this, but sometimes different threads can access at the same time, so is needed to do another verification:
                if (singletonMultiThreadClass == null) {
                    singletonMultiThreadClass = new SingletonMultiThreadClass();
                    testNumber = i;
                }
            }
        }
        return singletonMultiThreadClass;
    }

    public String method() {
        return "I am a class that use Singleton Pattern in Multi Thread environment! My number is: "+testNumber;
    }
}
