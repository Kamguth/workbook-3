package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();


        System.out.println("We carry the following inventory: ");
        for (Product p : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f%n", p.getId(), p.getName(), p.getPrice());

        }
    }
public static ArrayList<Product> getInventory() {
            ArrayList<Product> inventory = new ArrayList<>();
            inventory.add(new Product(1, "Apples", 0.99));
            inventory.add(new Product(2, "Steaks", 16.00));
            inventory.add(new Product(3, "Chicken", 12.99));
            inventory.add(new Product(4, "Salmon", 15.99));
            inventory.add(new Product(5, "Potatoes", 4.49));
            return inventory;
        }



    }



