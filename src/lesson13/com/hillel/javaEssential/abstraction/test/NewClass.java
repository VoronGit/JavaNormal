package lesson13.com.hillel.javaEssential.abstraction.test;

public class NewClass {
    static {
        System.out.println("1");
    }

    {
        System.out.println("4");
    }

    public NewClass() {
        System.out.println("3");
    }

    static {
        System.out.println("2");
    }

    {
        System.out.println("5");
    }

}

class Main {
    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        NewClass newClass1 = new NewClass();
    }
}
