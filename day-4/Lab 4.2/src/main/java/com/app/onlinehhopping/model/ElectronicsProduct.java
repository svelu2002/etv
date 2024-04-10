package com.app.onlinehhopping.model;

public class ElectronicsProduct extends Product{

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    double price;
    String brand;

    @Override
    public String getCategory() {
        return "ElectronicsProduct";
    }

    public ElectronicsProduct(String name, double price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "ElectronicsProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
