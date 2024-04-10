package com.app.onlinehhopping.model;

public class GroceryProduct extends Product {
    String name;
    double price;
    String category;

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

    @Override
    public String getCategory() {
        return "ClothingProduct" + "-" + category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public GroceryProduct(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
