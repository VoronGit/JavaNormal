package Stepik.lesson_3_5;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class YourName {
    public static void main(String[] args) {
        new MainFrame("ShowMyName", 600, 200, new SayName());
    }
}

class SayName extends JPanel {
    String name;
    {
        name = JOptionPane.showInputDialog("Type in your name!");
        JOptionPane.showMessageDialog(null, name);
    }
}