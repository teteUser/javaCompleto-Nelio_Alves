package advanced.functionalandlambda.comparator;

import advanced.functionalandlambda.entities.Product;

import java.util.*;

public class ComparatorProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.90));

        // Sorting by price
        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for(Product p : list){
            System.out.println(p);
        }

    }

}
