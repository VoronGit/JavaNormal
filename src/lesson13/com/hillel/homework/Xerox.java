package lesson13.com.hillel.homework;
public class Xerox extends Printer{
    public Xerox(String toSet){
        super("Newspaper");
    }

    public static void main(String[] args) {
        Xerox print = new Xerox("Newspaper");
        print.print(print.value);
    }
}
