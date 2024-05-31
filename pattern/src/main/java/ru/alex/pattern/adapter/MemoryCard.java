package ru.alex.pattern.adapter;

public class MemoryCard implements UsbCard {
    @Override
    public void connect() {
        System.out.println("Читаем данные...");
    }
}
