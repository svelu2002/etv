package com.app.onlinehhopping.service;

import com.app.onlinehhopping.model.ClothingProduct;
import com.app.onlinehhopping.model.ElectronicsProduct;
import com.app.onlinehhopping.model.GroceryProduct;
import com.app.onlinehhopping.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Product> products = new ArrayList<>();

    public boolean checkAvailability(Product product) {
        // Todo: Implement method to check availability of product in inventory
//        if (products.contains(product))
//            return true;
//        else
//            return  false;
        if (product instanceof ClothingProduct) {
            return products.stream().anyMatch(p -> p instanceof ClothingProduct);
        } else if (product instanceof ElectronicsProduct) {
            return products.stream().anyMatch(p -> p instanceof ElectronicsProduct);
        } else if (product instanceof GroceryProduct) {
            return products.stream().anyMatch(p -> p instanceof GroceryProduct);
        } else {
            return false;
        }
    }

    public void addToInventory(Product product) {
        products.add(product);
    }

    public void printInventory(){
        products.forEach(System.out::println);
    }

}
