package homeWorks.homeWork_13.handler;

public class Main {
    public static void main(String[] args) {
        XMLHandler xmlHandler = new XMLHandler();
        TXTHandler txtHandler = new TXTHandler();
        DOCHandler docHandler = new DOCHandler();
        xmlHandler.open();
        txtHandler.open();
        docHandler.open();
        xmlHandler.change();
        txtHandler.change();
        docHandler.change();
        xmlHandler.save();
        txtHandler.save();
        docHandler.save();
    }
}
