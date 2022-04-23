package lesson13.com.hillel.javaEssential.abstraction.ex004_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    // �������������� ����� overriddenMethod() �������� ������������ ������.
    // ���� �� �� ������������� �����, �� ����� ����������� ����� �� �������� ������.

    @Override
    public void overriddenMethod() {
        System.out.println("DerivedClass.overriddenMethod();");
    }

    // ��������� ����������� ����� abstractMethod() �������� ������������ ������.
    @Override
    public void abstractMethod() {
        System.out.println("DerivedClass.abstractMethod();");
    }
}
