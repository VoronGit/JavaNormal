package Stepik.lesson_5_1;

public class Kamaz {
    private double speed;
    private double gruz;
    private String color;
    private static byte whell_count = 4;

    public Kamaz(double speed, double gruz) {
        this.speed = speed;
        this.gruz = gruz;
        this.color = "orange";
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getGruz() {
        return gruz;
    }

    public void setGruz(double gruz) {
        this.gruz = gruz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void goodok(){
        System.out.println("Too - too!!!");
    }

    public static void show_description(){
        System.out.println("Это класс для камаз!");
    }

    @Override
    public String toString() {
        return "Kamaz (" + getGruz() + " т, " + getSpeed() + " км/час, Цвет: " + getColor() + ".";
    }
}
