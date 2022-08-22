package hillel.classWork.classWork_14;

import hillel.classWork.classWork_14.enums.Chars;
import hillel.classWork.classWork_14.enums.Locals;
import hillel.classWork.classWork_14.enums.Operations;

import java.util.ArrayList;
import java.util.List;

import static hillel.classWork.classWork_14.UserIntHandler.*;

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
        //Pattern p = Pattern.compile("\\d/(/)/+/=/-/*//|[/+/-/*/=//]+]"); // \\d - любая десятичная цифра
        //Matcher matcher = p.matcher(str);
        //if (!matcher.matches()) return false;
        char[] charArray = str.toCharArray();

        int leftBracket = 0;
        int rightBracket = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == Chars.OPEN_BRACKET.getValue()) {
                leftBracket++;
            } else if (charArray[i] == Chars.CLOSE_BRACKET.getValue()) {
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

    public static double mainEngine(String string) {
        return doSimpleMath(string);
    }

    public static String[] getSimpleMathArray(String string) {
        List<String> result = new ArrayList<>();
        char[] chars = string.toCharArray();

        for (Character character : chars) {
            if (character.equals(Chars.OPEN_BRACKET)) {
                continue;
            }
        }

        return new String[0];
        //     (5*(2-3)+5/(87+10))      - строка
        // --> 5*, 2-3, +5, /, 87+10    - массив
        // --> 5*, -1, +5, /, 97        - массив (после редюса)
        // --> 5*(-1)+5/97              - строка
        // --> 5*(-1), + , 5/97         - массив
        // --> -5 , + , 0.05            - массив (после редюса)
        // --> -5+0.05                  - строка
        // --> -5+0.05                  - массив
        // --> -0.25                    - массив (после редюса)
    }

    public static double doSimpleMath(String str) {

        String[] nums = str.split("[/+/-/*//]]");
        char oper = (str.split("\\d")[1]).charAt(0);

        if (oper == Operations.MULTIPLY.getValue()) {
            return Operations.MULTIPLY.count(Double.parseDouble(nums[0]), Double.parseDouble(nums[1]));
        } else if (oper == Operations.DIVISION.getValue()) {
            return Operations.DIVISION.count(Double.parseDouble(nums[0]), Double.parseDouble(nums[1]));
        } else if (oper == Operations.ADDITION.getValue()) {
            return Operations.ADDITION.count(Double.parseDouble(nums[0]), Double.parseDouble(nums[1]));
        } else if (oper == Operations.SUBTRACTION.getValue()) {
            return Operations.SUBTRACTION.count(Double.parseDouble(nums[0]), Double.parseDouble(nums[1]));
        } else {
            throw new IllegalArgumentException();
        }
    }
}
