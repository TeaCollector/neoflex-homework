package ru.alex.pattern.factory;

public class Coffee {

    public void smell() {
        System.out.printf("It smells like %s", this.getClass().getSimpleName());
    }
}
