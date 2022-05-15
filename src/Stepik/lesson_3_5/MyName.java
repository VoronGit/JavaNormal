package Stepik.lesson_3_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyName {
    public static void main(String[] args) {
        new MainFrame("ShowMyName", 600, 200, new ShowName());
    }
}

class ShowName extends JPanel {
    {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (KeyEvent.VK_SPACE == key) {
                    JOptionPane.showMessageDialog(null,"Roman!");
                }
            }
        });
    }
}