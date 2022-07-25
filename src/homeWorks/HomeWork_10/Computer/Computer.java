package homeWorks.HomeWork_10.Computer;

public class Computer {
    private String name;
    public static void main(String[] args) {
        Computer[] Computers = new Computer[5];
        for (int i = 0; i < 5; i++) {
            Computer computer = new Computer();
            computer.setName("computer" + i + 1);
            Computers[i] = computer;
        }
        System.out.println(toString(Computers));

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static String toString(Computer[] arrey) {
        String str = "";
        for (int i = 0; i < arrey.length; i++)
            str += (i == arrey.length - 1) ? arrey[i].getName() : arrey[i].getName() + ", ";
        return str;
    }
}