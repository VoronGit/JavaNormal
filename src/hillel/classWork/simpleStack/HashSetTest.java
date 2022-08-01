package hillel.classWork.simpleStack;


import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("JUN");
        hashSet.add("JUL");
        hashSet.add("AUG");
        hashSet.add("AUG");

        System.out.println(hashSet);

        Set<Student> hashSet2 = new TreeSet<>();
        hashSet2.add(new Student((byte) 20, "Bob"));
        hashSet2.add(new Student((byte) 21, "Bor"));

        System.out.println(hashSet2);
        // Object --> Collections --> Arrays
    }
}

class Student implements Comparable{
    public byte age;
    public String name;

    public Student(byte age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        if (age != ((Student) o).age) {
            return age - ((Student) o).age;
        } else {
            return  name.compareTo(((Student) o).name);
        }
    }

    @Override
    public String toString() {
        return "Student age= " + age + ", name='" + name + '\'' + '.';
    }
}