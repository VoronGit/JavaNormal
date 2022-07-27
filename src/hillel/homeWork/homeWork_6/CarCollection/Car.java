package hillel.homeWork.homeWork_6.CarCollection;

public class Car implements Comparable {
    private String manufacturer;
    private int year;
    private String color;
    private int speed;

    public Car(String manufacturer, int year, String color, int speed) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public int compareTo(Object o) {
        if (speed < ((Car) o).speed) {
            return 1;
        } else if (speed > ((Car) o).speed) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return speed+"";
    }
}
