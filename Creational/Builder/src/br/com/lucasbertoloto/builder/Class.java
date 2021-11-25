package br.com.lucasbertoloto.builder;

public class Class {
    private boolean attr1;
    private boolean attr2;
    private boolean attr3;
    private boolean attr4;

    public Class(boolean attr1) {
        this.attr1 = attr1;
    }

    public Class(boolean attr1, boolean attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }

    public Class(boolean attr1, boolean attr2, boolean attr3) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
    }

    public Class(boolean attr1, boolean attr2, boolean attr3, boolean attr4) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
        this.attr4 = attr4;
    }
}
