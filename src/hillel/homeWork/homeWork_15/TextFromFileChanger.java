package hillel.homeWork.homeWork_15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TextFromFileChanger {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/hillel/homeWork/homeWork_15/text.txt"))) {
            for(String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String string = stringBuilder.toString();

        ArrayList<String> regexpArr =
                new ArrayList(
                        List.of(
                                new String[]{" в ", " без ", " до ", " из ", " к ", " на ", " по ", " о ", " от ", " перед ",
                                              "В ",  "Без ",  "До ",  "Из ",  "К ",  "На ",  "По ",  "О ",  "От ",  "Перед "}));

        String regexp = "(" + String.join(")|(", regexpArr) + ")";
        string = string.replaceAll(regexp," Java ");
        try (FileWriter fileWriter = new FileWriter("src/hillel/homeWork/homeWork_15/text.txt")) {
            fileWriter.write(string);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
