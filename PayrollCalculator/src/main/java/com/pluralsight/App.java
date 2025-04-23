package com.pluralsight;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        try {

            System.out.print("Enter the name of the employee file to process: ");
            String inputFile = scanner.nextLine();

            System.out.print("Enter the name of the file to create: ");
            String outputFile = scanner.nextLine();

            //Initializes buffReader, bufWriter and fileReader, fileWriter and refers to
            //the user input variable "inputFile"
            BufferedReader bufReader = new BufferedReader(new FileReader(inputFile));
            //creates a file to write on storing it in the outputFile variable
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(outputFile));


            bufReader.readLine(); //skips first line

            bufWriter.write("id|name|gross pay\n");

            String input;
            //reads each line from the file one at a time and stores it into the input variable
            while ((input = bufReader.readLine()) != null) {
                String[] parts = input.split("\\|");
                //input.split(Pattern.quote("\\|")) - alternate method of above

                //this parses the strings into appropriate data types
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);

                //creates a new employee object using the parsed data, calling up the this. and naming it emp
                Employee emp = new Employee(id, name, hoursWorked, payRate);
                //calls the method function from the Employee.java class to store the gross pay in the variable "grossPay"
                double grossPay = emp.getGrossPay();

                bufWriter.write(id + "|" + name + "|" + String.format("%.2f", grossPay) + "\n");



                /*System.out.printf("Employee: %s (ID: %d)%n", emp.getName(), emp.getEmployeeId());
                System.out.printf("Hours Worked: %.2f, Pay Rate: $%.2f%n", emp.getHoursWorked(), emp.getPayRate());
                System.out.printf("Gross Pay: $%.2f%n", emp.getGrossPay());
                System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");*/


            }
            bufWriter.close();
            bufReader.close();
            System.out.println("Payroll: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
