package br.com.lucasbertoloto.singleton;

//This Pattern is used to make the application creates only an instance of the class
public class SingletonClass {
    private static SingletonClass singletonClass; //Create a attribute private and static to be referred

    private SingletonClass() {} //Let the constructor private

    public static SingletonClass getInstance() { //Create a static method to get the instance, if instance is null create the instance
        if (singletonClass==null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public String method(){
        return "I am a class that use Singleton Pattern!";
    }
}
