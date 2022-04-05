package advanced.functionalandlambda.predicate;

import advanced.functionalandlambda.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class PredicateProgram {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        System.out.println("\nAntes do removeIf:");
        for(Product p : list){
            System.out.println(p);
        }

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);

        System.out.println("\n----------------------------------------\n\nDepois do removeIf:");
        for(Product p : list){
            System.out.println(p);
        }


    }

}
