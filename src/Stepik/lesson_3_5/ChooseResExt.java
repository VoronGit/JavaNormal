package Stepik.lesson_3_5;

import javax.swing.*;
import java.util.ArrayList;

public class ChooseResExt {
    public static ArrayList<Options> possibilities = new ArrayList<>();
    public static void main(String[] args) {
        possibilities.add(new Options(800,600));
        possibilities.add(new Options(1024,768));
        possibilities.add(new Options(1200,600));
        possibilities.add(new Options(1280,1024));
        possibilities.add(new Options(1680,1050));
        possibilities.add(new Options(1920,1080));
        new AskForResExt();
    }
}

class AskForResExt extends JOptionPane {
    Options answer;
    JPanel panel = new JPanel();
    ButtonGroup group = new ButtonGroup();
    {
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        int i = 0;
        for (Options obj : ChooseResExt.possibilities) {
            JRadioButton r = new JRadioButton(ChooseResExt.possibilities.get(i).name);
            r.setActionCommand(String.valueOf(i));
            group.add(r);
            panel.add(r);
            i++;
        }
        int cho = showConfirmDialog(null,panel,"Choose resolution",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (cho == 0) {
            new MainFrame(ChooseResExt.possibilities.get(Integer.parseInt(group.getSelection().getActionCommand())).name
                        , ChooseResExt.possibilities.get(Integer.parseInt(group.getSelection().getActionCommand())).resW
                        , ChooseResExt.possibilities.get(Integer.parseInt(group.getSelection().getActionCommand())).resH
                        , new JPanel());
        }
    }
}