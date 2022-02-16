package poo.ex131fixation.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            System.out.printf("Product #%d data:", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            if(){

            }else if{

            }


        }





        scan.close();
    }

}
