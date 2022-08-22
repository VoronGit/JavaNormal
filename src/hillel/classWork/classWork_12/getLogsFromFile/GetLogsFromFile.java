package hillel.classWork.classWork_12.getLogsFromFile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GetLogsFromFile {
    static public Map<String,String> getFromFile(String filePath) {
        Map<String,String> result = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String str;
            while ((str = br.readLine()) != null) {
                if (str.charAt(0) == 'O') {
                    result.put(str.substring(15),str);
                } else {
                    result.remove(str.substring(15));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}