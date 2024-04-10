package com.upg.program.model;

public sealed class Product permits Clothing, Electronics{

    protected String productName;
    protected int productId;
    protected double price;
    protected int quantityInStock;

    public void Product(String laptop, int i, double v, int i1) {

    }
    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity InStock: " + quantityInStock);
    }

}
