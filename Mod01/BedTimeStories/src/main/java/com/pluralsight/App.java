package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the name of the story file to read: ");
        String filename = inputScanner.nextLine();

        InputStream is = App.class.getResourceAsStream("/" + filename);
        if (is == null) {
            System.out.println("Error: File not found in resources folder.");
            return;
        }

        Scanner fileScanner = new Scanner(is);
        int lineNumber = 1;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.printf("%02d: %s%n", lineNumber, line);
            lineNumber++;
        }

        fileScanner.close();
        inputScanner.close();
    }
}