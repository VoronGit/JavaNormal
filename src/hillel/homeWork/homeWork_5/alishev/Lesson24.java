package hillel.homeWork.homeWork_5.alishev;

public class Lesson24 {
    public static void main(String[] args) {
        Human2 h1 = new Human2("Bob",40);
        System.out.println(h1);
    }
}

class Human2 {
    private String name;
    private int age;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  name + ", " + age;
    }
}