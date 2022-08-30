package hillel.homeWork.homeWork_14;


import hillel.homeWork.homeWork_14.enums.Locals;
import hillel.homeWork.homeWork_14.enums.Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static hillel.homeWork.homeWork_14.UserIntHandler.getString;
import static hillel.homeWork.homeWork_14.UserIntHandler.isRepeat;
import static hillel.homeWork.homeWork_14.enums.Chars.*;
import static hillel.homeWork.homeWork_14.enums.Operations.*;

public class CalcEngine {
    public static void calcCall(){
        String string = getString();
        giveAnswer(string, isRight(string));
        if (isRepeat()) calcCall();
    }

    public static boolean isRight(String str){
        if (!str.matches("[\\d()*/+-]+")) return false;
        Pattern pat = Pattern.compile("[*/+-][*/+-]+");
        Matcher m = pat.matcher(str);
        if (m.find()) return false;
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

    public static void giveAnswer(String string, boolean isRight){
        if (isRight) {
            System.out.printf(String.valueOf(Locals.GIVEANSWER), string, mainEngine(string));
            System.out.println();
        } else {
            System.out.printf(String.valueOf(Locals.GIVEANSWER), string, "error");
            System.out.println();
        }
    }

    private static String mainEngine(String string) {
        char[] chars = string.toCharArray();
        List<Double> numbers = new ArrayList<>();
        List<Operations> operations = new ArrayList<>();
        StringBuilder currNumber = new StringBuilder();
        boolean wasDigit = false;
        double result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                wasDigit = true;
                currNumber.append(chars[i]);
            } else {
                wasDigit = false;
                if (!currNumber.toString().equals("")) {
                    numbers.add(Double.parseDouble(currNumber.toString()));
                    currNumber = new StringBuilder();
                }
                if (chars[i] == OPEN_BRACKET.getValue()) {
                    //(87+(2+1)+(2+1))
                    //(-2+1)+(2+1)
                    //((6*9-3)+64)/2
                    int openBracketCount = 1;
                    int closeBracketPosition = 0;
                    for (int j = i + 1; j < chars.length; j++) {
                        if (chars[j] == '(') openBracketCount++;
                        else if (chars[j] == ')') openBracketCount--;
                        if (openBracketCount == 0) {
                            closeBracketPosition = j;
                            break;
                        }
                    }
                    numbers.add(Double.parseDouble(mainEngine(string.substring(i+1,closeBracketPosition))));
                    i = closeBracketPosition;
                } else {
                    switch (chars[i]) {
                        case '+':
                            operations.add(ADDITION);
                            break;
                        case '-':
                            if (wasDigit) operations.add(SUBTRACTION);
                            else currNumber.append('-');
                            break;
                        case '*':
                            operations.add(MULTIPLY);
                            break;
                        case '/':
                            operations.add(DIVISION);
                            break;
                    }
                }
            }
        }


        return String.valueOf(0);
    }
}