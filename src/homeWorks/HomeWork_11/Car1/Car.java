package Car1;

public class Car {
    private int year;
    private String color;

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("red");
        Car car3 = new Car(2001);
        Car car4 = new Car(2008, "blue");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
    }

    public Car() {
        this.year = 1997;
        this.color = "white";
    }

    public Car(String color) {
        this.year = 1997;
        this.color = color;
    }

    public Car(int year) {
        this.year = year;
        this.color = "white";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString () {
        String str = "Характеристики машины:\n" +
                     "Год выпуска машины: " + year + ".\n" +
                     "Цвет машины: " + color + ".\n";
        return str;
    }
}
