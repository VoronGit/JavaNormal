package hillel.homeWork.homeWork_6.alishev.lesson28;

import hillel.homeWork.homeWork_6.alishev.lesson28.Packet1.Person;

public class Test {
    public int id;

    public static void main(String[] args) {
        //public, private, default(в пределах пакета), protected(в пределах пакета и у наследников)
        Person person = new Person();
        //person.name = "Bob";
        System.out.println(Person.CONSTANT);
    }
}
