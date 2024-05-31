package ru.alex.pattern.factory;

public enum CoffeeType {
    AMERICANO("Американо"),
    ESPRESSO("Эспрессо");

    private String name;

    CoffeeType(String name) {
        this.name = name;
    }
}
