package Car3;

public class Car {
    private int year;
    private String color;
    private int weight;
    private double speed;

    public static void main(String[] args) {
        Car3.Car car1 = new Car3.Car();
        Car3.Car car2 = new Car3.Car(2001);
        Car3.Car car3 = new Car3.Car(2001, 124.5);
        Car3.Car car4 = new Car3.Car(2001, 124.5, 3);
        Car3.Car car5 = new Car3.Car(2001, 124.5, 3, "red");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
    }

    public Car() {
        this(1997, 65.4, 2, "white");
    }

    public Car(int year) {
        this(year, 65.4, 2, "white");
    }
    public Car(int year, double speed) {
        this(year, speed, 2, "white");
    }
    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "white");
    }
    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
