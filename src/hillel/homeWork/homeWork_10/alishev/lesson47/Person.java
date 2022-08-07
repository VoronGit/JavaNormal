package hillel.homeWork.homeWork_10.alishev.lesson47;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 12321334556547L;

    private int id;
    private String personName;
    private int age;
    private byte sex;

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    @Override
    public String toString() {
        return id + " : " + personName;
    }
}
