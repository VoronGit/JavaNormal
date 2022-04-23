package lesson13.com.hillel.homework;
public class Canon extends Printer {
    public Canon(String toSet) {
        super("выпвыпвы");
    }

    public static void main(String[] args) {
        Canon print = new Canon("Book");
        print.print(print.value);
    }
}

