package advanced.functionalandlambda.util;

import advanced.functionalandlambda.entities.Product;

import java.util.function.Function;

public class UpperCaseNameFunction implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }

}
