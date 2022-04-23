package homeWorks.HomeWork_12;

public class Canon extends Printer{

    public Canon() {
        super("black");
    }

    public Canon(String color) {
        super(colorHash.containsKey(color) ? color : "black");
    }
}
