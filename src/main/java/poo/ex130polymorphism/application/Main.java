package poo.ex130polymorphism.application;

import poo.ex130polymorphism.entities.Employee;
import poo.ex130polymorphism.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            System.out.printf("\nEmployee #%d data:\n", i);
            scan.nextLine();
            System.out.print("Outsourced (y/n)? ");
            String c = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Hours: ");
            int hours = scan.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            if(c.equals("y") || c.equals("Y")){
                System.out.print("Additional charge: ");
                double addCharge = scan.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, addCharge);
                employees.add(employee);
            }else if (c.equals("n") || c.equals("N")){
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }

        System.out.println("\n--------------------------------");
        System.out.println("PAYMENTS:");
        for(Employee emp : employees){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        System.out.println("--------------------------------");

        scan.close();
    }

}
