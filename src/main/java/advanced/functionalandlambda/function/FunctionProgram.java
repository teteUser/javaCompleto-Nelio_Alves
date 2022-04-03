package advanced.functionalandlambda.function;

import advanced.functionalandlambda.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FunctionProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Applying upperCase logic with interface Function implemented by UpperCaseNameFunction class
        //List<String> names = list.stream().map(new UpperCaseNameFunction()).collect(Collectors.toList());

        // Applying upperCase logic with Static method from Product class
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // Applying upperCase logic with NON static method from Product class
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        // Applying upperCase logic with declared Lambda Expression
        /*Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());*/

        // Applying upperCase logic with Inline Lambda Expression
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
        
    }

}
