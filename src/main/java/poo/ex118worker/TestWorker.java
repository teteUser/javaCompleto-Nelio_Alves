package poo.ex118worker;

import java.util.Locale;
import java.util.Scanner;

public class TestWorker {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String depName, workerName;
        double baseSalary;
        int n;

        System.out.println("\nEnter department's name: ");
        depName = scan.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        workerName = scan.nextLine();
        System.out.print("Level: ");

        System.out.print("Base salary: ");
        baseSalary = scan.nextInt();

        System.out.print("How many wcontracts to this worker? ");
        n = scan.nextInt();




        scan.close();
    }

}
