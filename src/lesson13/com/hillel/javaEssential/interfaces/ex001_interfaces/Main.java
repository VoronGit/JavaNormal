package lesson13.com.hillel.javaEssential.interfaces.ex001_interfaces;

/**
 * Интерфейсы.
 */

interface Interface {
    void method();
}

class MyClass implements Interface {
    public void method() {
        System.out.println("Method - realizaciya Interface.");
    }
}

public class Main {
    public static void main(String[] args) {
        Interface my = new MyClass();

        my.method();
    }
}
