package hillel.homeWork.homeWork_14.system;


import hillel.homeWork.homeWork_14.system.enums.Locals;
import hillel.homeWork.homeWork_14.system.enums.Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static hillel.homeWork.homeWork_14.system.UserIntHandler.getString;
import static hillel.homeWork.homeWork_14.system.UserIntHandler.isRepeat;
import static hillel.homeWork.homeWork_14.system.enums.Chars.*;
import static hillel.homeWork.homeWork_14.system.enums.Operations.*;

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
            String result = String.format(String.valueOf(Locals.GIVEANSWER), string, (isRight) ? mainEngine(string) : "error");
            System.out.println(result);
            LogsWriter.writeLogs(result);
    }

    private static String mainEngine(String string) {
        char[] chars = string.toCharArray();
        List<Double> numbers = new ArrayList<>();
        List<Operations> operations = new ArrayList<>();
        StringBuilder currNumber = new StringBuilder();
        boolean wasDigit = false;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                wasDigit = true;
                currNumber.append(chars[i]);
            } else {
                if (!currNumber.toString().equals("")) {
                    numbers.add(Double.parseDouble(currNumber.toString()));
                    currNumber = new StringBuilder();
                }
                if (chars[i] == OPEN_BRACKET.getValue()) {
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
                    wasDigit = true;
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
                    wasDigit = false;
                }
            }
        }
        if (!currNumber.toString().equals("")) {
            numbers.add(Double.parseDouble(currNumber.toString()));
            currNumber = new StringBuilder();
        }
            for (int i = 0; i < operations.size(); i++) {
                if (operations.get(i) == Operations.MULTIPLY || operations.get(i) == Operations.DIVISION) {
                    Double a = numbers.get(i);
                    Double b = numbers.get(i + 1);
                    Double rez;
                    if (operations.get(i) == Operations.MULTIPLY) {
                        rez = Operations.MULTIPLY.count(a, b);
                    } else {
                        rez = Operations.DIVISION.count(a, b);
                    }
                    numbers.set(i, rez);
                    numbers.remove(i + 1);
                    operations.remove(i);
                }
            }
            for (int i = 0; i < operations.size();) {
                if (operations.get(i) == Operations.ADDITION || operations.get(i) == Operations.SUBTRACTION) {
                    Double a = numbers.get(i);
                    Double b = numbers.get(i + 1);
                    Double rez;
                    if (operations.get(i) == Operations.ADDITION) {
                        rez = Operations.ADDITION.count(a, b);
                    } else {
                        rez = Operations.SUBTRACTION.count(a, b);
                    }
                    numbers.set(i, rez);
                    numbers.remove(i + 1);
                    operations.remove(i);
                }
            }
        return String.valueOf(numbers.get(0));
    }
}