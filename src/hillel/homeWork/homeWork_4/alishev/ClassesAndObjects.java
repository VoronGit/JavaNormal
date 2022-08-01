package hillel.homeWork.homeWork_4.alishev;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман",20);
        person1.sayHello();
        person1.speak();
        String s1 = "Вова";
        Person person2 = new Person();
        person2.setNameAndAge(s1,30);
        person2.sayHello();
        person2.speak();
        System.out.printf("Количество лет до пенсии: %d \n", person1.calculateYearsToRetirement());
        System.out.printf("Количество лет до пенсии: %d \n", person2.calculateYearsToRetirement());
    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}