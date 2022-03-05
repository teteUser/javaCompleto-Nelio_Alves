package interfaces.exercises.model.application;

import interfaces.exercises.model.entities.Contract;
import interfaces.exercises.model.entities.Installment;
import interfaces.exercises.model.services.ContractService;
import interfaces.exercises.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class InterfaceExercise{

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = scan.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(scan.next());
        System.out.print("Contract value: ");
        double totalValue = scan.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter number of installments: ");
        int n = scan.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("\nInstallments:");
        for(Installment x : contract.getInstallment()){
            System.out.println(x);
        }

    }

}
