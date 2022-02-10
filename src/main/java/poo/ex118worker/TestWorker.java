package poo.ex118worker;

import poo.ex118worker.entities.Department;
import poo.ex118worker.entities.HourContract;
import poo.ex118worker.entities.Worker;
import poo.ex118worker.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TestWorker {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("\nEnter department's name: ");
        String depName = scan.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = scan.nextLine();
        System.out.print("Level: ");
        String workerLevel = scan.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(depName));

        System.out.print("How many contracts to this worker? ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            System.out.printf("Enter contract #%d data: \n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scan.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        int year1 = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f\n", monthAndYear, worker.income(year1, month));

        worker.removeContract(worker.getContracts().get(1));

        scan.close();
    }

}
