package advanced.functionalandlambda.function;

import advanced.functionalandlambda.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class FilteredSum {

    public static double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for(Product p : list){
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }

}
