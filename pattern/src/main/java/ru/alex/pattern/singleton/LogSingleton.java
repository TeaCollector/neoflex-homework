package ru.alex.pattern.singleton;

import java.time.Instant;


public class LogSingleton {

    private static volatile LogSingleton instance;

    private LogSingleton() {}

    public static LogSingleton getInstance() {
        if (instance == null) {
            synchronized (LogSingleton.class) {
                if (instance == null) {
                    instance = new LogSingleton();
                }
            }
        } return instance;
    }

    public void classLog(Object object, String info) {
        System.out.printf("Log info: %s - %s - %s", Instant.now(), object.getClass().getSimpleName(), info);
    }
}
