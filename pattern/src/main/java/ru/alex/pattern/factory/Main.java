package ru.alex.pattern.factory;

public class Main {

    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        System.out.println("Class is: " + coffee.getClass().getSimpleName());
    }
}
