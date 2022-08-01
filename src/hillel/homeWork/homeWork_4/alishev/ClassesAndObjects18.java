package hillel.homeWork.homeWork_4.alishev;

public class ClassesAndObjects18 {
    public static void main(String[] args) {
        Person18 person1 = new Person18();
        person1.setName("Роман");
        person1.setAge(-4);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
    }
}

class Person18 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Ты ввёл пустое имя");
        }
        name = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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