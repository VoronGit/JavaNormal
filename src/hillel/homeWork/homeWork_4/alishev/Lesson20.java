package hillel.homeWork.homeWork_4.alishev;

public class Lesson20 {
    public static void main(String[] args) {
        Human2 human = new Human2();
    }
}

class Human2 {
    private String name;
    private int age;

    public Human2() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human2(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human2(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo(){
        System.out.println(name + ", " + age);
    }
}