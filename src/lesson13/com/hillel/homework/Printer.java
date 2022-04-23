package lesson13.com.hillel.homework;
public class Printer {
    public String value;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public Printer(String toSet) {
        this.value = toSet;
    }

    public static void print (String value){
        switch (value){
            case "Book":
                System.out.println(ANSI_RED + value + ANSI_RED );
                break;
            case "Newspaper":
                System.out.println(ANSI_PURPLE + value + ANSI_PURPLE);
                break;

                default:
                System.out.println(ANSI_YELLOW + value +ANSI_YELLOW );
            
        }
    }
}