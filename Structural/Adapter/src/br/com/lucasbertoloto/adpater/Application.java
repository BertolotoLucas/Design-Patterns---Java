package br.com.lucasbertoloto.adpater;

public class Application {
    //this pattern helps Client to deal with another class that can not directly
    public static void main(String[] args) {
        String stolenMessage = new Encryption().encrypt();
        System.out.println("I got this message: "+stolenMessage);
        //I need an adapter to understand the message!
        //In this case Adapter is a Decryption class.
        stolenMessage = Decryption.decrypt(stolenMessage);
        System.out.println("I got this message: " +stolenMessage);
        //Adapter could be used to convert data like temperature, distance or something
    }
}
