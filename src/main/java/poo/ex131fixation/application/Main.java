package poo.ex131fixation.application;

import poo.ex131fixation.entities.ImportedProduct;
import poo.ex131fixation.entities.Product;
import poo.ex131fixation.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
            if(ch == 'i' || ch == 'I'){
                System.out.print("Customs fee: ");
                double fee = scan.nextDouble();
                Product product = new ImportedProduct(name, price, fee);
                productList.add(product);
            }else if(ch == 'u' || ch == 'U'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scan.nextLine());
                UsedProduct product = new UsedProduct(name, price, date);
            }


        }





        scan.close();
    }

}
