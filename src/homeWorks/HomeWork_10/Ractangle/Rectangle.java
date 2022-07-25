package homeWorks.HomeWork_10.Ractangle;

import java.util.Scanner;

public class Rectangle {

    static double side1;
    static double side2;

    public static void main(String[] args) {
        System.out.println("Введите стороны прямоугольника в сантиметрах (Например: 4,41 6,92):");
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                side1 = scan.nextDouble();
                side2 = scan.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Неверный формат, попробуйте снова:");
                scan.next();
            }
        }
        System.out.println("Периметр прямоугольника: " + Rectangle.perimeterCalculator(side1,side2) + " см.");
        System.out.println("Площадь прямоугольника: " + Rectangle.areaCalculator(side1,side2) + " см2.");
    }


    static double areaCalculator(double side1, double side2) {
        double ans = side1 * side2;
        return ans;
    }

    static double perimeterCalculator (double side1, double side2) {
        double ans = 2 * side1 + 2 * side2;
        return ans;
    }

}
