package br.com.lucasbertoloto.adpater;

import java.util.Base64;

public class Decryption {
    public static String decrypt(String encryptedText) {
        return new String(Base64.getDecoder().decode(encryptedText.getBytes()));
    }
}
