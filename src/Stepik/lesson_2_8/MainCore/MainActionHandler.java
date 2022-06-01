package Stepik.lesson_2_8.MainCore;


import java.util.Scanner;

abstract class MainActionHandler {

    public MainActionHandler() {
        Scanner scan = new Scanner(System.in);
        getClientInput(scan);
        scan.close();
    }

    abstract void getClientInput(Scanner scan);
}
