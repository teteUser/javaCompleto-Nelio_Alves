package advanced.functionalandlambda.methodreference;

import advanced.functionalandlambda.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MethodReferenceProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        // Method Reference with static method
        //list.removeIf(Product::staticProductPredicate);

        // Method Reference with NON-static method
        list.removeIf(Product::nonStaticProductPredicate);

        for(Product p : list){
            System.out.println(p);
        }



    }

}
