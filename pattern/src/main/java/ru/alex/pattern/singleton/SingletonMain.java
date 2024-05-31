package ru.alex.pattern.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        var log = LogSingleton.getInstance();

        log.classLog(new SingletonMain(), "HELLO!");
    }
}
