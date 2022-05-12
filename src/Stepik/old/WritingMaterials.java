package Stepik.old;

public class WritingMaterials {
     private String name;
     private String color;
     private int price;
     private double length;
     private boolean draw;
     private int perNumber;
     static int number = 0;
     final static String description = "Это класс для различных письменных принадлежностей";

    {
        number++;
        perNumber = number;
        setName("DefaultName");
        setColor("DefaultColor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public WritingMaterials() {
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.price = price;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.color = "No Color";
        this.price = price;
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.name = "No Name";
        this.color = "No Color";
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public void display() {
         System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + (draw ? "Да" : "Нет") + ".");
     }

    public void replace_rod(String color) {
        this.color = color;
    }

    public void priceUp(int n) {
         this.price += n;
    }

    public void priceDown(int n) {
        this.price -= n;
    }
    public void draw() {
        if (draw) System.out.println(name + " провёл линий: 1. Их цвет - " + color + ".");
        else System.out.println(name + " не может ничего нарисовать.");
    }
    public void draw(int i) {
        if (draw) System.out.println(name + " провёл линий: " + i + ". Их цвет - " + color + ".");
        else System.out.println(name + " не может ничего нарисовать.");
    }
    public void draw(String color) {
        if (draw) System.out.println(name + " провёл линий: 1. Их цвет - " + color + ".");
        else System.out.println(name + " не может ничего нарисовать.");
    }
    public void draw(String color, int i) {
        if (draw) System.out.println(name + " провёл линий: " + i + ". Их цвет - " + color + ".");
        else System.out.println(name + " не может ничего нарисовать.");
    }

    static String getDescription() {
        return description;
    }

    public String toString() {
        String s = "Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + (draw ? "Да" : "Нет") + ". Порядковый номер: " + perNumber;
        return s;
    }
}

class Pen extends WritingMaterials {

    private int countColor = 1;
    private boolean auto;

    {
        setName("Pen");
        setColor("Blue");
    }

    public Pen() {
        super.setDraw(true);
    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    static void writeMyName() {
        System.out.println("Roman");
    }

    public void display(){
        System.out.println("This is Pen");
        super.display();
        System.out.println(" Количество стержней: " + countColor +", Автоматическая: " + (auto ? "Да." : "Нет."));
    }
}

final class Ruler extends WritingMaterials {

    private double length;
    private boolean wood;

    {
        setName("Ruler");
        setColor("NoColor");
    }

    public Ruler() {
        super.setDraw(false);
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    static void measure() {
        System.out.println("Сейчас померяем длину");
    }

    public void display(){
        System.out.println("This is Ruler");
        super.display();
        System.out.println(" Деревянный: " + (wood ? "Да." : "Нет."));
    }
}

class Divider extends WritingMaterials {

    private String dividerType;
    private boolean metal;

    {
        setName("Divider");
        setColor("Black");
    }

    public Divider() {
        super.setDraw(true);
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    final static void draw_circle() {
        System.out.println("Нарисован круг");
    }

    public void display(){
        System.out.println("This is Divider");
        super.display();
        System.out.println(" Тип: " + dividerType +", Металический: " + (metal ? "Да." : "Нет."));
    }
}
class Main2{
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();
        System.out.println(wm.toString());
        WritingMaterials.getDescription();
        Pen p = new Pen();
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();
        System.out.println(p.toString());

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.display();
        r.setLength(25);
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();
        System.out.println(r.toString());


        Divider d = new Divider();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();
        System.out.println(d.toString());
    }
}