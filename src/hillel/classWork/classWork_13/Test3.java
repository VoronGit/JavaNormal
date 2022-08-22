package hillel.classWork.classWork_13;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); //[3, 4, 5] - пересечение множеств.

        System.out.println(intersection);

        //Set<Integer> union = new HashSet<>(set1);
        //union.addAll(set2); //[1, 2, 3, 4, 5, 6, 7] - объединение множеств.
//
        //System.out.println(union);
//
        //Set<Integer> difference = new HashSet<>(set1);
        //difference.removeAll(set2); //[1, 2] - разность множеств.
//
        //System.out.println(difference);
//
        //Set<Integer> simDifference = new HashSet<>(set1);
        //simDifference.removeAll(set2);
        //Set<Integer> simLeftDifference = new HashSet<>(set2);
        //simLeftDifference.removeAll(set1);
        //simDifference.addAll(simLeftDifference);
//
        //System.out.println(simDifference);
    }
}
