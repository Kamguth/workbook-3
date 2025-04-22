package com.pluralsight;
import java.io.*;
public class App {
    public static void main(String[] args) {
        try
        {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            bufReader.readLine();

            String input;

            while((input = bufReader.readLine()) != null) {String[] parts = input.split("\\|");

int id = Integer.parseInt(parts[0]);
String name = parts[1];
double hoursWorked = Double.parseDouble(parts[2]);
double payRate = Double.parseDouble(parts[3]);

                Employee emp = new Employee(id, name, hoursWorked, payRate);
                System.out.printf("Employee: %s (ID: %d)%n", emp.getName(), emp.getEmployeeId());
                System.out.printf("Hours Worked: %.2f, Pay Rate: $%.2f%n", emp.getHoursWorked(), emp.getPayRate());
                System.out.printf("Gross Pay: $%.2f%n", emp.getGrossPay());
                System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");



            }
            bufReader.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
