package com.car;

public class Car {
    private String model;
    private String carYear;
    private double carPrice;

    public Car(String model, String carYear, double carPrice) {
        this.model = model;
        this.carYear = carYear;
        this.carPrice = carPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public double getDiscount(double amount) {
        double discount = carPrice - amount;
        return discount;
    }
}
