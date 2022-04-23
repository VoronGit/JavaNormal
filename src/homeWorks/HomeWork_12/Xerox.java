package homeWorks.HomeWork_12;

public class Xerox extends Printer {

    public Xerox() {
        super("cyan");
    }

    public Xerox(String color) {
        super(colorHash.containsKey(color) ? color : "cyan");
    }
}
