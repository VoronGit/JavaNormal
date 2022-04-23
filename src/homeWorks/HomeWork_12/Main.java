package homeWorks.HomeWork_12;

public class Main {
    public static void main(String[] args) {
        Printer printerC1 = new Canon("red");
        Printer printerC2 = new Canon("yellow");
        Printer printerC3 = new Canon();
        Printer printerC4 = new Canon("синий");
        Printer printerX1 = new Xerox("red");
        Printer printerX2 = new Xerox("yellow");
        Printer printerX3 = new Xerox();
        Printer printerX4 = new Xerox("синий");
        printerC1.print("Это предложение печатает первый принтер, он типа Canon и при создании объекта был передан цвет печати красный, а значит оно будет напечатано красным цветом!");
        printerC2.print("Это предложение печатает второй принтер, он типа Canon и при создании объекта был передан цвет печати желтый, а значит оно будет напечатано желтым цветом!");
        printerC3.print("Это предложение печатает третий принтер, он типа Canon, дефолтный цвет для него черный, а значит оно будет напечатано черным цветом!");
        printerC4.print("Это предложение печатает четвертый принтер, он типа Canon и при создании объекта был неправильно передан цвет печати, дефолтный цвет для него черный, а значит оно будет напечатано черным цветом!");
        printerX1.print("Это предложение печатает первый принтер, он типа Xerox и при создании объекта был передан цвет печати красный, а значит оно будет напечатано красным цветом!");
        printerX2.print("Это предложение печатает второй принтер, он типа Xerox и при создании объекта был передан цвет печати желтый, а значит оно будет напечатано желтым цветом!");
        printerX3.print("Это предложение печатает третий принтер, он типа Xerox, дефолтный цвет для него голубой, а значит оно будет напечатано голубым цветом!");
        printerX4.print("Это предложение печатает четвертый принтер, он типа Xerox и при создании объекта был неправильно передан цвет печати, дефолтный цвет для него голубой, а значит оно будет напечатано черным цветом!");
        System.out.println("Это доп. метод, который может выделять цветом отдельные слова по специальным маркерам типа <black> - для начала выделения цветом и </> - для окончания.");
        String str = "Например: <blue>синий</>, <yellow>желтый</>. Остальные слова этого предложения напечатаны дефолтным либо заданным для этого принтера цветом.";
        printerC1.colorPrint(str);
        printerC2.colorPrint(str);
        printerC3.colorPrint(str);
        printerX1.colorPrint(str);
        printerX2.colorPrint(str);
        printerX3.colorPrint(str);
    }
}
