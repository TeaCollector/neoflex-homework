package ru.alex.pattern.proxy;

public class Main {

    public static void main(String[] args) {
        DataBase db = new DataBase();
        ProxyDB proxyToDB = new ProxyDB(db);
        var service = new Service(proxyToDB);

        service.connectToDB();
    }
}
