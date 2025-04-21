package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            try {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Please select a number between 1 and 10: ");
                int val = scanner.nextInt();

                String[] quotes = {
                        "A lion does not concern itself with the opinions of a sheep",
                        "Be the change that you wish to see in the world. – Mahatma Gandhi",
                        "I think, therefore I am. – René Descartes",
                        "Injustice anywhere is a threat to justice everywhere. – Martin Luther King Jr.",
                        "That which does not kill us makes us stronger. – Friedrich Nietzsche",
                        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. – Ralph Waldo Emerson",
                        "Life is what happens when you're busy making other plans. – John Lennon",
                        "The only thing we have to fear is fear itself. – Franklin D. Roosevelt",
                        "Imagination is more important than knowledge. – Albert Einstein",
                        "Success is not final, failure is not fatal: it is the courage to continue that counts. – Winston Churchill"};

                int index = val - 1;
                System.out.println(quotes[index]);
                run = false;
            } catch (Exception e) {
                System.out.println("Invalid choice");
            }
        }
        ;
    }}






