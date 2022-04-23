package homeWorks.HomeWork_12;

import java.util.HashMap;

public class Printer {
    protected static HashMap<String, String> colorHash;
    private static String colorMod;
    private String color;


    public Printer (String color) {
        this.color = color;
    }

    static {
        colorHash = new HashMap<>();
        colorHash.put("default", "\u001B[0m");
        colorHash.put("black", "\u001B[30m");
        colorHash.put("red", "\u001B[31m");
        colorHash.put("green", "\u001B[32m");
        colorHash.put("yellow", "\u001B[33m");
        colorHash.put("blue", "\u001B[34m");
        colorHash.put("purple", "\u001B[35m");
        colorHash.put("cyan", "\u001B[36m");
        colorHash.put("white", "\u001B[37m");
    }

    public void print(String charSet) {
        colorMod = colorHash.get(color);
        System.out.println(colorMod + charSet + colorHash.get("default"));
    }

    public void colorPrint(String charSet) {
        for (String colorKey : colorHash.keySet())
            charSet = charSet.replace("<"+colorKey+">", colorHash.get(colorKey));
            charSet = charSet.replace("</>", colorHash.get(color));
        System.out.println(colorHash.get(color) + charSet + colorHash.get(color));
    }
}
