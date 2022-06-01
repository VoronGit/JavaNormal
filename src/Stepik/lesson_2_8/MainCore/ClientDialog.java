package Stepik.lesson_2_8.MainCore;

import java.util.Scanner;

public class ClientDialog {
    public String getMenuNumber(String str){
        final String[] num = new String[1];
        System.out.println(str);
        new MainActionHandler() {
            @Override
            void getClientInput(Scanner scan) {
                num[0] = scan.nextLine();
            }
        };
        return num[0];
    }
}
