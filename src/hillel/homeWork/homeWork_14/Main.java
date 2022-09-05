package hillel.homeWork.homeWork_14;

import hillel.homeWork.homeWork_14.system.enums.Locals;
import hillel.homeWork.homeWork_14.system.CalcEngine;
import hillel.homeWork.homeWork_14.system.LogsWriter;

public class Main {
    public static void main(String[] args) {
        LogsWriter.initialize();
        System.out.println(Locals.START);
        CalcEngine.calcCall();
        System.out.println(Locals.END);
        LogsWriter.logsEnd();
    }
}
