package Stepik.lesson_3_4;

import javax.swing.*;
import java.awt.*;

public class ChangeMyMouse {
    public static void main(String[] args) {
    new MainFrame("ChangeMyMouse", 800, 800, new MouseChanger());
    }
}
class MouseChanger extends JPanel {
    public void paintComponent(Graphics g) {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}