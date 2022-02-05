package poo.ex82banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        Conta account = new Conta(scan.nextInt());
        System.out.print("Enter account holder: ");
        account.setNomeTitular(scan.next());


        System.out.print("Is there an initial deposit (y/n)? ");
        String resp = scan.next();
        if(resp.charAt(0) == 'y'){
            System.out.print("Enter initial deposit value: ");
            account.depositar(scan.nextDouble());
        }

        System.out.println("Account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", account.getNumConta(), account.getNomeTitular(), account.getSaldo());

        System.out.print("Enter a deposit value: ");
        account.depositar(scan.nextDouble());


        scan.close();
    }

}
