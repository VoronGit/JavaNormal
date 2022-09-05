package hillel.homeWork.homeWork_14.system;

import hillel.homeWork.homeWork_14.system.enums.Locals;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogsWriter {
    private static String logsFilePath = "src/hillel/homeWork/homeWork_14/logs.txt";
    public static void writeLogs(String s) {
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss --> ");
        String date = formatter.format(new Date(System.currentTimeMillis()));
        try (FileWriter fw = new FileWriter(logsFilePath, true)) {
            fw.append(date);
            fw.append(s);
            fw.append("\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void initialize() {
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String date = formatter.format(new Date(System.currentTimeMillis()));

        try (FileWriter fw = new FileWriter(logsFilePath, true)) {
            fw.append("\n");
            fw.append(String.format(String.valueOf(Locals.LOGSINITIALIZATION), date));
            fw.append("\n\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void logsEnd() {
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String date = formatter.format(new Date(System.currentTimeMillis()));

        try (FileWriter fw = new FileWriter(logsFilePath, true)) {
            fw.append("\n");
            fw.append(String.format(String.valueOf(Locals.LOGSEND), date));
            fw.append("\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
