package Stepik.lesson_3_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class MoveMeWithArrowsExtWithShift {
    public static void main(String[] args) {
        new MainFrame("MoveMeWithArrows",900,900, new Spider2());
    }
}

class Spider2 extends JPanel {
    int xCor, yCor;
    BufferedImage img = GetImg.getMeImg("Spider");
    BufferedImage grass = GetImg.getMeImg("Grass");
    {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                int speed = 10;
                if(e.isShiftDown()) speed = 20;
                if (KeyEvent.VK_RIGHT == key) {
                    xCor += speed;
                    if (xCor > getWidth()/2) xCor = - getWidth()/2;
                } else if (KeyEvent.VK_LEFT == key) {
                    xCor -= speed;
                    if (-xCor + img.getWidth()/2 > getWidth()/2) xCor = getWidth()/2;
                } else if (KeyEvent.VK_DOWN == key) {
                    yCor += speed;
                    if (yCor > getHeight()/2) yCor = - getHeight()/2;
                } else if (KeyEvent.VK_UP == key) {
                    yCor -= speed;
                    if (-yCor + img.getHeight()/2 > getHeight()/2) yCor = getHeight()/2;
                }
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getWidth()/2 - img.getWidth()/2 + xCor;
        int y = getHeight()/2 - img.getHeight()/2 + yCor;
        int curX = 0;
        int curY = 0;
        Graphics2D g2d = (Graphics2D) g.create();
        while (curY < getHeight()) {
            while (curX < getWidth()) {
                g2d.drawImage(grass,curX,curY,this);
                curX += grass.getWidth();
            }
            curY += grass.getHeight();
            curX =0;
        }
        g2d.drawImage(img, x, y, null);
        g2d.dispose();
    }

}