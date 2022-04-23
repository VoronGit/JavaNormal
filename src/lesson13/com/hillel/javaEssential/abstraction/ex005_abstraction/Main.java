package lesson13.com.hillel.javaEssential.abstraction.ex005_abstraction;

public class Main {
    public static void main(String[] args) {
        AbstractBaseClass instance = new ConcreteDerivedClass();

        instance.simpleMethod();
        instance.abstractMethod();
    }
}
