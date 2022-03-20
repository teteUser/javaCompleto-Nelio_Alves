package advanced.functionalandlambda.comparator;

import java.util.*;

public class ComparatorProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<ComparatorProduct> list = new ArrayList<>();

        list.add(new ComparatorProduct("TV", 900.00));
        list.add(new ComparatorProduct("Notebook", 1200.00));
        list.add(new ComparatorProduct("Tablet", 450.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(ComparatorProduct p : list){
            System.out.println(p);
        }

    }

}
