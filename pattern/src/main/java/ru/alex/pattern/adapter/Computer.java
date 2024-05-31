package ru.alex.pattern.adapter;

public class Computer {

    private final UsbCard usbCard;

    public Computer(UsbCard usbCard) {
        this.usbCard = usbCard;
    }

    public void read() {
        usbCard.connect();
    }
}
