package hillel.homeWork.homeWork_6.carCollection;

import java.util.Comparator;

public class ComparatorByYear implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car) o1).getYear() - ((Car) o2).getYear();
    }
}