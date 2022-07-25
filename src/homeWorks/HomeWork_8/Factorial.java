package homeWorks.HomeWork_8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
            int num = askForNumber();
            giveMeAnswer(num, findFactorial(num));
    }

    static int askForNumber() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, факториал которого вы хотите расчитать:");
        while (true) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                break;
            }
            sc.next();
            System.out.println("Неверные данные, попробуйте снова:");
        }
        sc.close();
        return num;
    }

    public static int findFactorial(int num) {
        if (num >= 1) {
            return num * findFactorial(num - 1);
        } else {
            return 1;
        }
    }

    static void giveMeAnswer(int num, int ans) {
        System.out.println("Результат: " + num + "! = " + ans + ".");
    }
}