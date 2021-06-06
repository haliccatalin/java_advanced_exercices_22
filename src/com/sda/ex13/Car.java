package com.sda.ex13;

public class Car {
    private String engine;
    private int yearManufacturer;
    private String manufacturer;
    private double price;

    public Car(String engine, int yearManufacturer, String manufacturer, double price) {
        this.engine = engine;
        this.yearManufacturer = yearManufacturer;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getYearManufacturer() {
        return yearManufacturer;
    }

    public void setYearManufacturer(int yearManufacturer) {
        this.yearManufacturer = yearManufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", yearManufacturer=" + yearManufacturer +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
