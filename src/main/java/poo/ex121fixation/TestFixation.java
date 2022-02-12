package poo.ex121fixation;

import general.enums.Order;
import poo.ex121fixation.entities.Client;
import poo.ex121fixation.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class TestFixation {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Client client1 = new Client();

        System.out.println("\nEnter client data:");
        System.out.print("Name: ");
        client1.setName(scan.nextLine());
        System.out.print("Email: ");
        client1.setEmail(scan.nextLine());
        System.out.print("Birth date (DD/MM/YYYY): ");
        client1.setBirthDate(sdf.parse(scan.nextLine()));

        Order order1 = new Order();
        System.out.println("\nEnter order data:");
        System.out.print("Status: ");


        System.out.println(client1.getName());

        // In progress...


    }

}
