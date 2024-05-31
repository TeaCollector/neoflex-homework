package ru.alex.pattern.singleton;

public class Main {

    public static void main(String[] args) {
        LogSingleton log = LogSingleton.getInstance();

        log.classLog(new Main(), "HELLO!");
    }
}
