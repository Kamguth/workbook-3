package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("inventory.csv"));

            String file;
            while ((file = bufReader.readLine()) != null) {
                String[] parts = file.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);


                inventory.add(new Product(id, name, price));


            }

            /*inventory.add(new Product(1, "Apples", 0.99));
            inventory.add(new Product(2, "Steaks", 16.00));
            inventory.add(new Product(3, "Chicken", 12.99));
            inventory.add(new Product(4, "Salmon", 15.99));
            inventory.add(new Product(5, "Potatoes", 4.49));*/
            return inventory;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}



