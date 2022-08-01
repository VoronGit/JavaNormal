package hillel.homeWork.homeWork_5.alishev;

public class Lesson21 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",30);
        Human h2 = new Human("Tom",40);
        h1.getNumberOfPeople();
        h2.getNumberOfPeople();
    }
}

class Human {
    private String name;
    private int age;
    public static int countPeople;

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}
