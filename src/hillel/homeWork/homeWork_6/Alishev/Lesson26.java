package hillel.homeWork.homeWork_6.Alishev;

import hillel.homeWork.homeWork_6.Alishev.Interfaces.Animal;
import hillel.homeWork.homeWork_6.Alishev.Interfaces.Info;
import hillel.homeWork.homeWork_6.Alishev.Interfaces.Person;

public class Lesson26 {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);
        outputInfo(animal);
        outputInfo(person);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
