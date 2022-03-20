package advanced.functionalandlambda.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<ComparatorProduct> {

    @Override
    public int compare(ComparatorProduct p1, ComparatorProduct p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }

}
