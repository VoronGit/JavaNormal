package hillel.homeWork.homeWork_5.Alishev;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Bark!!!");
    }

    public void showName() {
        System.out.println(name);;
    }
}