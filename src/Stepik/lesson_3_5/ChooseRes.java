package Stepik.lesson_3_5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;

public class ChooseRes {
    public static ArrayList<Options> possibilities = new ArrayList<>();
    public static void main(String[] args) {
        possibilities.add(new Options(800,600));
        possibilities.add(new Options(1024,768));
        possibilities.add(new Options(1200,600));
        possibilities.add(new Options(1280,1024));
        possibilities.add(new Options(1680,1050));
        possibilities.add(new Options(1920,1080));
        new AskForRes();
    }
}

class AskForRes extends JOptionPane {
    Options answer;
    {
        answer = (Options) JOptionPane.showInputDialog(
                null,
                "Choose resolution ",
                "Choose resolution from options bellow",
                JOptionPane.PLAIN_MESSAGE,
                null,
                ChooseRes.possibilities.toArray(), null);

        new MainFrame(answer.name,answer.resW,answer.resH,new JPanel());
    }
}

class Options {
    int resW;
    int resH;
    String name;

    public Options(int resW, int resH) {
        this.resW = resW;
        this.resH = resH;
        this.name = resW + "X" + resH;
    }
    public String toString() {
        return name;
    }
}