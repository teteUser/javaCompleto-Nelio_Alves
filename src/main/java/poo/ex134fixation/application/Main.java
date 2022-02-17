package poo.ex134fixation.application;

import poo.ex134fixation.entities.Company;
import poo.ex134fixation.entities.Individual;
import poo.ex134fixation.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print("\nTax payer #" + i + " data:\n");
            System.out.print("Individual or company (i/c)? ");
            char ch = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Annual income: ");
            double income = scan.nextDouble();
            if(ch == 'i' || ch == 'I') {
                System.out.print("Health expenditures: ");
                double health = scan.nextDouble();
                Individual taxPayer = new Individual(name, income, health);
                taxPayerList.add(taxPayer);
            }else if (ch == 'c' || ch == 'C'){
                System.out.print("Number of employees: ");
                int employees = scan.nextInt();
                Company taxPayer = new Company(name, income, employees);
                taxPayerList.add(taxPayer);
            }
        }

        double sum = 0.0;
        System.out.println("\nTAXES PAID:");
        for(TaxPayer taxPayer : taxPayerList){
            System.out.print(taxPayer.toString());
            sum += taxPayer.taxCalculation();
        }

        System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", sum) + "\n");

    }


}
