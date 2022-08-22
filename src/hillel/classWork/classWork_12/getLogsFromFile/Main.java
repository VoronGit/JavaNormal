package hillel.classWork.classWork_12.getLogsFromFile;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = GetLogsFromFile.getFromFile("src/hillel/classWork/classWork_12/getLogsFromFile/log.txt");

        System.out.println(map);
    }
}
