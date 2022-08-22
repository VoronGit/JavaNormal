package hillel.classWork.classWork_13;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Set<Person> pSet = new TreeSet<>(new PersonComparator());
        Person person1 = new Person("Maks", 1);
        Person person2 = new Person("Maks", 1);

        pSet.add(person1);
        pSet.add(person2);

        System.out.println(pSet);

        Set<String> sSet = new TreeSet<>(new StringComparator());

        sSet.add("string1");
        sSet.add("string223");
        sSet.add("s213213tring3");
        sSet.add("stringdsf4");
        sSet.add("string521321");

        System.out.println(sSet);

        Set<Integer> nSet = new TreeSet<>(new NumberComparator());

        nSet.add(1);
        nSet.add(2);
        nSet.add(3);
        nSet.add(4);
        nSet.add(5);

        System.out.println(nSet);

        List<String> sList = new ArrayList<>();

        sList.add("string1");
        sList.add("string223");
        sList.add("s213213tring3");
        sList.add("stringdsf4");
        sList.add("string521321");

        System.out.println(sList);
        System.out.println();

        Collections.sort(sList,new StringComparator());
        sList.sort(new StringComparator());

        System.out.println(sList);

        List<Integer> nList = new ArrayList<>();

        nList.add(1);
        nList.add(2);
        nList.add(3);
        nList.add(4);
        nList.add(5);

        System.out.println(nList);
        System.out.println();

        Collections.sort(nList, (o1, o2) -> o2 - o1);

        System.out.println(nList);
        System.out.println();
    }
}
