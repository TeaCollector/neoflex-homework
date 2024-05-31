package ru.alex.pattern.factory;

public class Coffee {

    public void smell() {
        System.out.printf("It smells like %s\n", this.getClass().getSimpleName());
    }
}
