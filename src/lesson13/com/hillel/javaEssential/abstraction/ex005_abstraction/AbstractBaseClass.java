package lesson13.com.hillel.javaEssential.abstraction.ex005_abstraction;

public abstract class AbstractBaseClass {
    // 1.
    // ����� ���������� ������������ ������ ��� ��� ������������ �� ����������� ������.
    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    // 2.
    // ����������� ����� - ����������� � ����������� ������.
    abstract public void abstractMethod();
}
