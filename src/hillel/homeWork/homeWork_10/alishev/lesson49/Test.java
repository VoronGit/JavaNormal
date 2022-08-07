package hillel.homeWork.homeWork_10.alishev.lesson49;

public class Test {
    public static void main(String[] args) {
        counter(3);
        System.out.printf("Factorial of 3 is %d",factorial(3));
        System.out.println();
        System.out.printf("Factorial of 4 is %d",factorial(4));
        System.out.println();
        System.out.printf("Factorial of 5 is %d",factorial(5));
        System.out.println();
    }

    public static void someMethod(){
        System.out.println("Hello!");
        someMethod();
    }

    public static void counter(int n){
        if (n == 0) return;
        System.out.println(n);
        counter(n - 1);
    }

    public static int factorial(int n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
}
