package poo.ex82banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        Conta account = new Conta(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter account holder: ");
        account.setNomeTitular(scan.nextLine());


        System.out.print("Is there an initial deposit (y/n)? ");
        String resp = scan.next();
        if(resp.charAt(0) == 'y'){
            System.out.print("Enter initial deposit value: ");
            account.depositar(scan.nextDouble());
        }

        System.out.println("Account data:");
        account.toStringVoid();

        System.out.print("Enter a deposit value: ");
        account.depositar(scan.nextDouble());
        System.out.println("Updated account data:");
        account.toStringVoid();

        System.out.print("Enter a withdraw value: ");
        account.sacar(scan.nextDouble());
        System.out.println("Updated account data: ");
        account.toStringVoid();


        scan.close();
    }

}
