package ru.alex.pattern.proxy;

public class DataBase implements Connection {

    private static final String DATABASE_NAME = "neo-flex";

    @Override
    public void connect() {
        System.out.println(DATABASE_NAME);
    }
}
