package com.sibsutis.devices;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, double price, String serialNumber, 
                   int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public void print() {
        System.out.println("Monitor: " + manufacturer + 
                         ", Resolution: " + resolutionX + "x" + resolutionY + 
                         ", Price: " + price + 
                         ", SN: " + serialNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX &&
               resolutionY == monitor.resolutionY &&
               Double.compare(monitor.price, price) == 0 &&
               Objects.equals(manufacturer, monitor.manufacturer) &&
               Objects.equals(serialNumber, monitor.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber, resolutionX, resolutionY);
    }
}