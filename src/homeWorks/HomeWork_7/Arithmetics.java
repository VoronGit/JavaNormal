package homeWorks.HomeWork_7;

import java.util.Scanner;

public class Arithmetics {

    public static void main(String[] args) {
        double result;
        String repeat = "Да";
        do {
            System.out.println("Введите математическое выражение с одной из доступных математических " +
                    "операций (+ - прибавить; - - отнять; * - умножить; / - поделить). \n" +
                    "Числа и знак разделяйте пробелом " + "(например 5.67 - 8.16): ");
            try {
                Scanner in1 = new Scanner(System.in);
                String[] st = in1.nextLine().split(" ");
                double first_num = Double.parseDouble(st[0]);
                String type = String.valueOf(st[1]);
                double second_num = Double.parseDouble(st[2]);
                if (type.equals("+")) {
                    result = add(first_num, second_num);
                } else if (type.equals("-")) {
                    result = sub(first_num, second_num);
                } else if (type.equals("*")) {
                    result = mul(first_num, second_num);
                } else if ((type.equals("/")) & (second_num != 0)) {
                    result = div(first_num, second_num);
                } else {
                    System.out.println("Неверный формат!");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Неверный формат!");
                continue;
            }
            System.out.println("Ответ: " + String.format("%.2f", result));
            System.out.println("Желаете повторить? (Да/Нет)");
            Scanner in2 = new Scanner(System.in);
            repeat = in2.nextLine();
        } while (repeat.equals("Да"));
        System.out.println("Хорошего дня!");
    }
    private static double add(double a, double b) {
        double result = a + b;
        return result;
    }
    private static double sub(double a, double b) {
        double result = a - b;
        return result;
    }
    private static double mul(double a, double b) {
        double result = a * b;
        return result;
    }
    private static double div(double a, double b) {
        double result = a / b;
        return result;
    }
}
