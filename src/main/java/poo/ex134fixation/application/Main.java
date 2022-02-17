package poo.ex134fixation.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print("\nTax payer #" + i + " data:\n");
            System.out.print("Individual or company (i/c)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Annual income: ");
            double income = scan.nextDouble();
            if(ch == 'i' || ch == 'I') {
                System.out.print("Health expenditures: ");
                double health = scan.nextDouble();
            }else if (ch == 'c' || ch == 'C'){
                System.out.print("Number of employees: ");
                int employees = scan.nextInt();
            }

        }


    }


}
