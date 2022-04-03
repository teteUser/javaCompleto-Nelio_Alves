package advanced.functionalandlambda.consumer;

import advanced.functionalandlambda.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ConsumerProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Applying Consumer logic with interface
        //list.forEach(new PriceUpdateConsumer());

        // Applying Consumer logic with declared Lambda Expression
        /*double factor = 1.1;
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
        list.forEach(cons);*/

        // Applying Consumer logic with inline Lambda Expression
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        // Applying Consumer logic by calling static method from Product class
        //list.forEach(Product::staticProductUpdate);

        // Applying Consumer logic by calling Non static method from Product class
        //list.forEach(Product::nonStaticProductUpdate);

        // Displaying output with Method Reference inside forEach
        list.forEach(System.out::println);

        /*
        for(Product p : list){
            System.out.println(p);
        }
        */


    }

}
