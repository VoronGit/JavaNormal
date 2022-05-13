package Stepik.lesson_3_3;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    public MainFrame (String title, int x, int y, Component component) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setTitle(title);
        setPreferredSize(new Dimension(x,y));
        add(component);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
