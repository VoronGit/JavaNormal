package hillel.homeWork.homeWork_9.alishev.lesson42;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        System.out.println(x == y);

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        String string1 = "Hello!";
        String string2 = "Hello!";

        System.out.println(string1 == string2);

        String string3 = new String("Hello!");
        String string4 = new String("Hello!");

        System.out.println(string3 == string4);

        String a = "hello!";
        String b = "hello!123".substring(0,6);

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
