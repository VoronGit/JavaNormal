package hillel.homeWork.homeWork_9.alishev.lesson43;

public class Electrocar {
    private int id;

    //вложенный нестатический класс
    private class Motor{
        public void startMotor(){
            System.out.printf("Motor %d is starting...",id);
            System.out.println();
        }
    }

    //вложенный статический класс
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        class SomeClass {
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject =  new SomeClass();
        test(someObject);

        System.out.printf("Electrocar %d is starting...",id);
        System.out.println();
    }

    public void test (Object object) {
    }
}
