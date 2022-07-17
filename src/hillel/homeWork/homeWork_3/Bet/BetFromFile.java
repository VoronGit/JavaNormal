package hillel.homeWork.homeWork_3.Bet;

import hillel.homeWork.homeWork_3.MyArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BetFromFile {
    public static String[] read(String filePath) throws IOException {

        MyArrayList<String> bets = new MyArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line = bufferedReader.readLine();
                while (line != null) {
                    bets.add(line);
                    line = bufferedReader.readLine();
                }
        }
        String[] strs = new String[bets.size()];
        for (int i = 0; i < bets.size(); i++) {
            strs[i] = bets.get(i);
        }
        return strs;
    }
}
