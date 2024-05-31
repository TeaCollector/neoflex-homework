package ru.alex.pattern.adapter;

public class AdapterToMemoryCard implements UsbCard {

    private final UsbCard usbCard;

    public AdapterToMemoryCard(UsbCard usbCard) {
        this.usbCard = usbCard;
    }

    @Override
    public void connect() {
        usbCard.connect();
    }
}
