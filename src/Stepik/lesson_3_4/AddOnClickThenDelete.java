package Stepik.lesson_3_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class AddOnClickThenDelete {
    public static void main(String[] args) {
        new MainFrame("AddOnClick", 800, 800, new OnClickAndDelete());
    }
}

class OnClickAndDelete extends JPanel {
    ArrayList<Oval> ovals = new ArrayList<>();

    protected void paintComponent(Graphics g) {
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    ovals.add(new Oval(e.getX(), e.getY(), Color.BLACK));
                    repaint();
                }
                if (e.getButton() == MouseEvent.BUTTON3) {
                    for (int i = 0; i < ovals.size(); i++) {
                        if (e.getX() >= ovals.get(i).x - 10 && e.getX() <= ovals.get(i).x + 10
                            &&
                            e.getY() >= ovals.get(i).y - 10 && e.getY() <= ovals.get(i).y + 10) {
                            ovals.remove(i);
                        }
                    }
                    repaint();
                }
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
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (ovals.size() > 0) {
            for (Oval oval : ovals) {
                g2d.setColor(oval.color);
                g2d.fillOval(oval.x - 10, oval.y - 10, 20, 20);
                g2d.drawString("X: " + oval.x + " Y: " + oval.y, oval.x - 35, oval.y - 15);
            }
        }
        g2d.dispose();
    }
}

class Oval {
    int x;
    int y;
    Color color;

    public Oval(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}