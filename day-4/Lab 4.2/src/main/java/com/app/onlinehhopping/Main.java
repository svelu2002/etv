package com.app.onlinehhopping;

import com.app.onlinehhopping.model.ClothingProduct;
import com.app.onlinehhopping.model.ElectronicsProduct;
import com.app.onlinehhopping.model.GroceryProduct;
import com.app.onlinehhopping.model.Product;

import com.app.onlinehhopping.service.Inventory;
import com.app.onlinehhopping.service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        // Todo: Create instances of products and add them to inventory
        Product p1 = new ClothingProduct("Polo T-Shirt", 500, "L");
        Product p2 = new ClothingProduct("Jeans", 1000, "Short");
        Product p3 = new ElectronicsProduct("Boat Speaker", 1200, "Boat");
        Product p4 = new ElectronicsProduct("Sony TV", 45000, "Sony");
        Product p5 = new GroceryProduct("Rice", 55.0, "Pulses");
        Product p6 = new GroceryProduct("Wheat", 66, "Pulses");

        Inventory inventory = new Inventory();
        inventory.addToInventory(p1);
        inventory.addToInventory(p2);
        inventory.addToInventory(p3);
        inventory.addToInventory(p4);
        inventory.addToInventory(p5);
        inventory.addToInventory(p6);

        // inventory.printInventory();

        ShoppingCart shoppingCart = new ShoppingCart();

        // Todo: Create a shopping cart and add products to it
        if (inventory.checkAvailability(p1))
            shoppingCart.addToCart(p1);
        else
            System.out.println("Product does not exit in Inventory");
        if (inventory.checkAvailability(p3))
            shoppingCart.addToCart(p3);
        if (inventory.checkAvailability(p5))
            shoppingCart.addToCart(p5);
        // Todo: Calculate total price and display

        shoppingCart.printCart();
        System.out.println("Total price is: " + shoppingCart.calculateTotalPrice());

    }
}