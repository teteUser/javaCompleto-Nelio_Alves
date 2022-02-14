package poo.ex121fixation;

import poo.ex121fixation.entities.Client;
import poo.ex121fixation.entities.OrderEx121;
import poo.ex121fixation.entities.OrderItem;
import poo.ex121fixation.entities.Product;
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
        orderEx121_1.setOrderStatus(OrderStatusEx121.valueOf(scan.nextLine()));
        System.out.print("How many items to this order? ");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=1; i<=n; i++){
            System.out.printf("Enter #%d item date:\n", i);
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            Double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = scan.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            orderEx121_1.addItem(orderItem);
        }

        orderEx121_1.toSummary();


    }

}
