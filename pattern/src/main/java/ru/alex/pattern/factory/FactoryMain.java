package ru.alex.pattern.factory;

import java.util.Set;


public class FactoryMain {

    public static void main(String[] args) {
        Coffee coffee = new Americano();
        coffee.smell();

        Set<Filters> filters = Set.of(Filters.AGAS, Filters.DUS);

        System.out.println(filters.stream().map(Enum::name).toList());
    }
}

enum Filters {
    SUS,
    AGAS,
    DUS,
}
