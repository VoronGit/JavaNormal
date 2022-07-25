package Stepik.lesson_3_1.Car2;

public class Car {
    private int year;
    private String color;
    private int weight;
    private double speed;

    public static void main(String[] args) {
        Stepik.lesson_3_1.Car2.Car car1 = new Stepik.lesson_3_1.Car2.Car();
        Stepik.lesson_3_1.Car2.Car car2 = new Stepik.lesson_3_1.Car2.Car(2001);
        Stepik.lesson_3_1.Car2.Car car3 = new Stepik.lesson_3_1.Car2.Car(2001, 124.5);
        Stepik.lesson_3_1.Car2.Car car4 = new Stepik.lesson_3_1.Car2.Car(2001, 124.5, 3);
        Stepik.lesson_3_1.Car2.Car car5 = new Stepik.lesson_3_1.Car2.Car(2001, 124.5, 3, "red");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
    }

    public Car() {
        this.year = 1997;
        this.speed = 65.4;
        this.weight = 2;
        this.color = "white";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 65.4;
        this.weight = 2;
        this.color = "white";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 2;
        this.color = "white";
    }
    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "white";
    }
    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
    @Override
    public String toString () {
        String str = "Характеристики машины:\n" +
                "Год выпуска: " + year + ".\n" +
                "Вес: " + weight + ".\n" +
                "Скорость: " + speed + ".\n" +
                "Цвет: " + color + ".\n";
        return str;
    }
}
