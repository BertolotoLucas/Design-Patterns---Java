package br.com.lucasbertoloto.factorymethod.model;

public enum TypeShape {
    SQUARE(1), CIRCLE(2);

    private final int value;

    TypeShape(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
