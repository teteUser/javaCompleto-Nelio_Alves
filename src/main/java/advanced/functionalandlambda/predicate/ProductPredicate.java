package advanced.functionalandlambda.predicate;

import advanced.functionalandlambda.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }

}
