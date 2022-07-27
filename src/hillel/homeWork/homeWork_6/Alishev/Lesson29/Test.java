package hillel.homeWork.homeWork_6.Alishev.Lesson29;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        Animal animalDog = new Dog();
        animalDog.eat();
        dog.bark();

        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(animalDog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
