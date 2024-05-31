package ru.alex.pattern.proxy;

public class ProxyDB implements Connection {

    private DataBase dataBase;

    public ProxyDB(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void connect() {
        System.out.print("You are connected to: http://localhost:8080/");
        dataBase.connect();
        System.out.println("Disconnect...");
    }
}
