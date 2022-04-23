package lesson13.com.hillel.javaEssential.abstraction.ex001_abstraction;

/**
 * Абстрактный класс.
 */
abstract class AbstractClass {
    public abstract void method();
}

/**
 * Конкретный класс.
 */
class ConcreteClass extends AbstractClass {
    @Override
    public void method() {
        System.out.println("\u001B[33m" + "Implementation");
        System.out.println("\u001B[35m" + "Implementation");
    }
    public void test () {

    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        instance.method();
    }
}
