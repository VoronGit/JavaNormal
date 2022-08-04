package hillel.homeWork.homeWork_7.alishev.lesson32;

public class Lesson32 {
    public static void main(String[] args) {
        //Upcasting - восходящее преобразование.
        Animal animal = new Dog();
        Dog dog = new Dog();

        Animal animal1 = dog;

        //Downcasting - нисходящее преобразование.
        Dog dog2 = (Dog) animal;

        dog2.bark();

        Animal a = new Animal();

        //Dog dog3 =  (Dog) a;

        //dog3.bark();
    }
}
