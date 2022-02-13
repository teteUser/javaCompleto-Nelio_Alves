package poo.ex121fixation;

import poo.ex121fixation.entities.Client;
import poo.ex121fixation.entities.OrderEx121;
import poo.ex121fixation.entities.enums.OrderStatusEx121;

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

        OrderEx121 orderEx121_1 = new OrderEx121();
        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        String orderStatus = scan.nextLine();
        orderEx121_1.setOrderStatus(OrderStatusEx121.valueOf(scan.nextLine()));
        System.out.print("How many items to this order? ");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){

        }

        System.out.println(client1.getName());

        // In progress...


    }

}
