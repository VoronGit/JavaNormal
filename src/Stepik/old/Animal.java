package Stepik.old;

public class Animal {
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;
    private int number;
    static final String discription = "Описание";
    static int animalCount = 0;

    {
        animalCount++;
        setNumber(animalCount);
        setName("DefaultName");
        setType("DefaultType");
    }

    public Animal() {
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.name = "No Name";
        this.age = age;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public void display() {
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight + ", Умеет летать: " + (isFly ? "Да" : "Нет")
                + ", Умеет ходить: " + (isWalk ? "Да" : "Нет") + ", Умеет плавать: " + (isSwim ? "Да." : "Нет."));
    }

    final public void rename(String name) {
        this.name = name;
    }

    public void holiday() {
        this.weight += 0.1;
    }

    public void holiday(double m) {
        this.weight += m;
    }

    public void holiday(double m, int n) {
        this.weight += m * n;
    }

    public static void getDiscription() {
        System.out.println(discription);
    }

    public String toString() {
        String s = "Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight + ", Умеет летать: " + (isFly ? "Да" : "Нет")
                + ", Умеет ходить: " + (isWalk ? "Да" : "Нет") + ", Умеет плавать: " + (isSwim ? "Да." : "Нет." + " Порядковый номер: " + number + ".");
        return s;
    }
}

class Bird extends Animal {

    private String area;
    private boolean winterFly;
    {
        setName("DefaultName");
        setType("Птица");
    }

    public Bird() {
        super.setFly(true);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    static void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }

    public void display(){
        System.out.println("I am Bird");
        super.display();
        System.out.println(" Среда обитания: " + area +", Улетаю зимой: " + (winterFly ? "Да." : "Нет."));
    }

}

final class Fish extends Animal {

    private String squama;
    private boolean upStreamSwim;

    {
        setName("DefaultName");
        setType("Рыба");
    }

    public Fish() {
        super.setSwim(true);
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    static void bul_bul() {
        System.out.println("Bul-bul");
    }

    public void display(){
        System.out.println("I am Fish");
        super.display();
        System.out.println(" Тип чешуи: " + squama +", Плаваю против течения: " + (upStreamSwim ? "Да." : "Нет."));
    }
}

class Insect extends Animal {

    private int wingCount;
    private boolean likeJesus;

    {
        setName("DefaultName");
        setType("Насекомое");
    }

    public Insect() {
        super.setWalk(true);
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    static void ggggg() {
        System.out.println("Ggggg");
    }

    public void display(){
        System.out.println("I am Insect");
        super.display();
        System.out.println(" Количество крыльев: " + wingCount +", Хожу по воде: " + (likeJesus ? "Да." : "Нет."));
    }
}

class Main1{
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();
        System.out.println(duck.toString());
        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();
        System.out.println(b.toString());

        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();
        System.out.println(f.toString());

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
        Animal.getDiscription();
        System.out.println(i.toString());
    }
}