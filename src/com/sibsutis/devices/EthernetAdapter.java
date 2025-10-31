package com.sibsutis.devices;

import java.util.Objects;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, double price, String serialNumber, 
                          int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public void print() {
        System.out.println("EthernetAdapter: " + manufacturer + 
                         ", Speed: " + speed + "Mbps" +
                         ", MAC: " + mac + 
                         ", Price: " + price + 
                         ", SN: " + serialNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed &&
               Double.compare(that.price, price) == 0 &&
               Objects.equals(manufacturer, that.manufacturer) &&
               Objects.equals(serialNumber, that.serialNumber) &&
               Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber, speed, mac);
    }
}