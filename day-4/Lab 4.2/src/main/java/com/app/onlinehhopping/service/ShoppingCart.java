package com.app.onlinehhopping.service;

import com.app.onlinehhopping.model.ClothingProduct;
import com.app.onlinehhopping.model.ElectronicsProduct;
import com.app.onlinehhopping.model.GroceryProduct;
import com.app.onlinehhopping.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> items = new ArrayList<>();

    public void addToCart(Product product) {
        // Todo: Implement method to add product to cart
        items.add(product);
    }

    public void printCart() {
        items.forEach(System.out::println);
    }

    public double calculateTotalPrice() {
        // Todo: Apply discounts if any
        double total = 0.0;
        double price;
        double calculatedPrice;
        for (Product item : items){
            price = 0.0;
            calculatedPrice = 0.0;
            if (item instanceof ClothingProduct c) {
                price = c.getPrice();
                calculatedPrice = price - (0.1 * price);
                total += calculatedPrice;
            } else if (item instanceof ElectronicsProduct e) {
                price = e.getPrice();
                calculatedPrice = price - (0.2 * price);
                total += calculatedPrice;
            } else if (item instanceof GroceryProduct g) {
                price = g.getPrice();
                calculatedPrice = price - (0.15 * price);
                total += calculatedPrice;
            }
        };
        return total;
    }
}

