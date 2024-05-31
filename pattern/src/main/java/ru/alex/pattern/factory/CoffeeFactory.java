package ru.alex.pattern.factory;

public class CoffeeFactory {

    public Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;
        switch (coffeeType) {
            case ESPRESSO: coffee = new Espresso(); break;
            case AMERICANO: coffee = new Americano(); break;
        }
        coffee.smell();
        return coffee;
    }
}