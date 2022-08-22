package hillel.classWork.classWork_13;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        set1.add("Roman");
        set1.add("Mike");
        set1.add("Zen");
        set1.add("Dima");
        set1.add("Dima");
        set1.add("Ann");

        set2.add("Roman");
        set2.add("Roman");
        set2.add("Mike");
        set2.add("Zen");
        set2.add("Dima");
        set2.add("Ann");

        set3.add("Roman");
        set3.add("Mike");
        set3.add("Mike");
        set3.add("Zen");
        set3.add("Dima");
        set3.add("Ann");

        System.out.println(set1.contains("Mike"));
        // Для выполнения метода:
        // 1 - берем хешкод от переданого ключа,
        // 2 - index = ket.hashcode() & (size-1) вытаскиваем из бакета значение,
        // 3 - сравниваем ключ из бакета с переданным ключем.


        System.out.println(set1.contains("Nike"));
        System.out.println();

        System.out.println(set1);
        System.out.println();
        System.out.println(set2);
        System.out.println();
        System.out.println(set3);

    }
}

class Person{
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //@Override
    //public int compareTo(Object o) {
    //    return this.id - ((Person) o).id;
    //}

    @Override
    public String toString() {
        return name + ": id=" + id;
    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //    Person person = (Person) o;
    //    return id == person.id && name.equals(person.name);
    //}
//
    //@Override
    //public int hashCode() {
    //    return Objects.hash(name, id);
    //}

    public int getId() {
        return id;
    }
}

class PersonComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Person) o1).getId() - ((Person) o2).getId();
    }
}

class StringComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}


