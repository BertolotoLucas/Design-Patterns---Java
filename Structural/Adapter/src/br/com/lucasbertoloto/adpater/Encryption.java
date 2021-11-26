package br.com.lucasbertoloto.adpater;

import java.util.Base64;

public class Encryption {
    private String pureText = "My secret message";
    public String encrypt() {
        return new String(Base64.getEncoder().encode(this.pureText.getBytes()));
    }
}
