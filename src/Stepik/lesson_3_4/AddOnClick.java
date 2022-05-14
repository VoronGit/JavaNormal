package Stepik.lesson_3_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AddOnClick {
    public static void main(String[] args) {
        new MainFrame("AddOnClick",800,800,new OnClick());
    }
}

class OnClick extends JPanel{

    boolean flag = false;
    int x;
    int y;

    protected void paintComponent(Graphics g){
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                flag = true;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        Graphics2D g2d = (Graphics2D) g;
        if (flag) g2d.fillOval(x - 10,y - 10,20,20);
        g2d.dispose();
    }
}