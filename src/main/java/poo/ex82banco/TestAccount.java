package poo.ex82banco;

import java.util.Locale;
import java.util.Scanner;

public class TestAccount {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        Account account = new Account(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter account holder: ");
        account.setHolder(scan.nextLine());


        System.out.print("Is there an initial deposit (y/n)? ");
        String resp = scan.next();
        if(resp.charAt(0) == 'y'){
            System.out.print("Enter initial deposit value: ");
            account.deposit(scan.nextDouble());
        }

        System.out.println("\nAccount data:");
        account.toStringVoid();

        System.out.print("\nEnter a deposit value: ");
        account.deposit(scan.nextDouble());
        System.out.println("Updated account data:");
        account.toStringVoid();

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(scan.nextDouble());
        System.out.println("Updated account data: ");
        account.toStringVoid();

        scan.close();
    }

}
