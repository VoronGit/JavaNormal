package Stepik.lesson_3_5;

import javax.swing.*;

public class YourAnswers {
    public static void main(String[] args) {
        new GiveAnswer();
    }
}

class GiveAnswer extends JOptionPane {
    int first;
    int second;
    String answer;
    {
        first = showConfirmDialog(null, "Вы умывались?");
        second = showConfirmDialog(null, "Вы завтракали?");
        if (first == second) {
            if (first == 0) {
                answer = "Вы умывались и завтракали!";
            } else {
                answer = "Вы не умывались и не завтракали!";
            }
        } else {
            if (first == 0) {
                answer = "Вы умывались, но не завтракали!";
            } else {
                answer = "Вы не умывались, но завтракали!";
            }
        }
        showMessageDialog(null, answer);
    }
}