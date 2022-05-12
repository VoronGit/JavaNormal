package Stepik.lesson_3_3;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    public MainFrame (String title, int x, int y, Component component) {
        setDefaultLookAndFeelDecorated(true);
        setTitle(title);
        setVisible(true);
        setBounds(400,200,x,y);
        add(component);
    }
}
