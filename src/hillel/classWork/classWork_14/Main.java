package hillel.classWork.classWork_14;

import hillel.classWork.classWork_14.enums.Locals;

public class Main {
    public static void main(String[] args) {
        System.out.println(Locals.START);
        CalcEngine.calcCall();
        System.out.println(Locals.END);
    }
}
