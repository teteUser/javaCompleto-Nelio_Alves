package advanced.generics.application;

import advanced.generics.services.PrintService;

import java.util.Scanner;

public class GenericsProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            Integer value = scan.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        scan.close();
    }

}
