package advanced.functionalandlambda.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    @Override
    public String toString() {
        return "Product [" +
                "Name: \'" + name + '\'' +
                ", Price: $" + String.format("%.2f", price) +
                ']';
    }

    @Override
    public int compareTo(Product p) {
        return name.toUpperCase().compareTo(p.getName().toUpperCase());
    }

    // Static method with predicate logic
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }

    // Non-static method with predicate logic
    public boolean nonStaticProductPredicate(){
        return price >= 100.0;
    }

    // Static method with Consumer logic
    public static void staticProductUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    // Non-static method with Consumer logic
    public void nonStaticProductUpdate(){
        price *= 1.1;
    }

}
