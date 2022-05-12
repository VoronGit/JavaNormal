package Stepik.lesson_3_1;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void createMainFrame(Object obj, int width, int height, String Title) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame(Title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setLocation(400, 20);
        frame.add((Component) obj);
        frame.pack();
        frame.setVisible(true);
    }
}
