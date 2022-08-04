package hillel.homeWork.homeWork_7.alishev;

public class Lesson35 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal(){
            @Override
            public void eat() {
                System.out.println("OtherAnimal eat");
            }
        };
        animal2.eat();

        AbleToEat animal3 = new AbleToEat(){
            @Override
            public void eat() {
                System.out.println("SomeOne eat");
            }
        };
        animal3.eat();
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal eat");
    }
}

interface AbleToEat {
    void eat();
}
