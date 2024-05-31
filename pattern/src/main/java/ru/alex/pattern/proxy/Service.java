package ru.alex.pattern.proxy;

public class Service {

    private final ProxyDB proxyDB;

    public Service(ProxyDB proxyDB) {
        this.proxyDB = proxyDB;
    }

    public void connectToDB() {
        proxyDB.connect();
    }
}
