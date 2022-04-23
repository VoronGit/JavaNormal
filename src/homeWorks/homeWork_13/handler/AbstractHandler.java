package homeWorks.homeWork_13.handler;
import java.util.Scanner;

public abstract class AbstractHandler {
        String fileName;

        public AbstractHandler() {
                this.create();
        }

        abstract void open();
        abstract void create();
        abstract void change();
        abstract void save();
}

class XMLHandler extends AbstractHandler {

        public XMLHandler() {
                super();
        }

        @Override
        void open() {
                System.out.println("Открываем файл " + fileName + ".xml");
        }

        @Override
        void create() {
                System.out.println("Введите имя файла:");
                Scanner sc = new Scanner(System.in);
                fileName = sc.nextLine();
                System.out.println("Создаём файл " + fileName + ".xml");
        }

        @Override
        void change() {
                System.out.println("Введите имя, на которое нужно поменять текущее:");
                Scanner sc = new Scanner(System.in);
                fileName = sc.nextLine();
                System.out.println("Файл " + fileName + ".xml изменён успешно.");
        }

        @Override
        void save() {
                System.out.println("Файл " + fileName + ".xml сохранён.");
        }
}

class TXTHandler extends AbstractHandler {


        public TXTHandler() {
                super();
        }

        @Override
        void open() {
                System.out.println("Открываем файл " + fileName + ".txt");
        }

        @Override
        void create() {
                System.out.println("Введите имя файла:");
                Scanner sc = new Scanner(System.in);
                fileName = sc.nextLine();
                System.out.println("Создаём файл " + fileName + ".txt");
        }

        @Override
        void change() {
                System.out.println("Введите имя, на которое нужно поменять текущее:");
                Scanner sc = new Scanner(System.in);
                fileName = sc.nextLine();
                System.out.println("Файл " + fileName + ".txt изменён успешно.");
        }

        @Override
        void save() {
                System.out.println("Файл " + fileName + ".txt сохранён.");
        }
}

class DOCHandler extends AbstractHandler {
        public DOCHandler() {
                super();
        }

        @Override
        void open() {
                System.out.println("Открываем файл " + fileName + ".doc");
        }

        @Override
        void create() {
                System.out.println("Введите имя файла:");
                Scanner sc = new Scanner(System.in);
                fileName = sc.nextLine();
                System.out.println("Создаём файл " + fileName + ".doc");
        }

        @Override
        void change() {
                System.out.println("Введите имя, на которое нужно поменять текущее:");
                Scanner sc = new Scanner(System.in);
                fileName = sc.nextLine();
                System.out.println("Файл " + fileName + ".doc изменён успешно.");
        }

        @Override
        void save() {
                System.out.println("Файл " + fileName + ".doc сохранён.");
        }
}