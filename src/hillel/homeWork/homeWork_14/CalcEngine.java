package hillel.homeWork.homeWork_14;


import hillel.homeWork.homeWork_14.enums.Locals;

import java.util.ArrayList;
import java.util.List;

import static hillel.classWork.classWork_14.UserIntHandler.getString;
import static hillel.classWork.classWork_14.UserIntHandler.isRepeat;
import static hillel.homeWork.homeWork_14.enums.Chars.*;
import static hillel.homeWork.homeWork_14.enums.Operations.*;

public class CalcEngine {
    public static void calcCall(){
        String string = getString();
        if (isRight(string)) {
            giveAnswer(string);
            if (isRepeat()) calcCall();
        } else {
            System.out.println(Locals.INVALIDSTATEMENT);
            calcCall();
        }
    }

    public static boolean isRight(String str){
        if (!str.matches("[\\\\d()*/+-]")) return false;
        char[] charArray = str.toCharArray();
        int leftBracket = 0;
        int rightBracket = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == OPEN_BRACKET.getValue()) {
                leftBracket++;
            } else if (charArray[i] == CLOSE_BRACKET.getValue()) {
                if (++rightBracket > leftBracket) return false;
            }
        }
        if (!(leftBracket == rightBracket)) return false;
        return true;
    }

    public static void giveAnswer(String string){
        System.out.printf(String.valueOf(Locals.GIVEANSWER),string,mainEngine(string));
        System.out.println();
    }

    private static double mainEngine(String string) {
        List<String> arr = new ArrayList<>();
        boolean lastIsNumber = false;
        StringBuilder
        for (char character : string.toCharArray()) {
            if (
                character == MULTIPLY.getValue() ||
                character == DIVISION.getValue() ||
                character == ADDITION.getValue()
            ){
                arr.add(String.valueOf(character));
                lastIsNumber = false;
            } else if (character == SUBTRACTION.getValue()) {
                if (lastIsNumber) {
                    arr.add(String.valueOf(character));
                    lastIsNumber = false;
                } else {

                }
            }
        }

        return 0;
    }


}
