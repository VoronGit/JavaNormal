package hillel.classWork.classWork_13;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Map<Person,String> personStringMap = new HashMap<>();
        Set<Person> personSet = new HashSet<>();

        Person person1 = new Person("Ann",1);
        Person person2 = new Person("Ann",1);

        personStringMap.put(person1,"Ann");
        personStringMap.put(person2,"Ann");

        personSet.add(person1);
        personSet.add(person2);

        System.out.println(personStringMap);
        System.out.println();
        System.out.println(personSet);

        for (Map.Entry entry: personStringMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Person key: personStringMap.keySet()) {
            System.out.println(key + " : " + personStringMap.get(key));
        }
    }
}
