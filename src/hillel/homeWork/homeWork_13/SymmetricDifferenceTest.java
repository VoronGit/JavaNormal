package hillel.homeWork.homeWork_13;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SymmetricDifferenceTest {
    public static void main(String[] args) {
        Set<String> setS1 = new HashSet<>(List.of(new String[]{"a", "b", "c"}));
        Set<String> setS2 = new HashSet<>(List.of(new String[]{"c", "b", "e"}));
        System.out.println(getSymDiff(setS1,setS2));

        Set<Integer> setI1 = new HashSet<>(List.of(new Integer[]{1, 2, 3}));
        Set<Integer> setI2 = new HashSet<>(List.of(new Integer[]{3, 2, 5}));
        System.out.println(getSymDiff(setI1,setI2));
    }

    public static Set getSymDiff(Set set1, Set set2) {
        Set simDifference = new HashSet(set1);
        simDifference.removeAll(set2);
        Set simLeftDifference = new HashSet(set2);
        simLeftDifference.removeAll(set1);
        simDifference.addAll(simLeftDifference);
        return simDifference;
    }
}
