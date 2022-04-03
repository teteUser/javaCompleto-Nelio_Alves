package advanced.functionalandlambda.lambda;

import advanced.functionalandlambda.entities.Product;
import advanced.functionalandlambda.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LambdaProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        // Lambda Expression with the method from Predicate Interface which was implemented by the ProductPredicate class
        list.removeIf(new ProductPredicate());

        // Direct Lambda Expression
        //list.removeIf(p -> p.getPrice() >= 100.0);

        // Sort
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p : list){
            System.out.println(p);
        }



    }

}
