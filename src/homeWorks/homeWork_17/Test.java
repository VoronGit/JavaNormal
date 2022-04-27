package homeWorks.homeWork_17;

class Animal {
    public  void eat() {
        System.out.println("Animal is eating...");
    }
}

interface AbleToEat {
    public void eat();
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal() {
            public  void eat() {
                System.out.println("Other animal is eating...");
            }
        };
        animal2.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat () {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();
    }
}
