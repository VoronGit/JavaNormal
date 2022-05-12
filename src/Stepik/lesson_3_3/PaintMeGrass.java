package Stepik.lesson_3_3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.io.File.*;

public class PaintMeGrass {
    public static void main(String[] args) {
        new MainFrame("PaintMeGrass", 800, 800, new Grass());
    }
}

class Grass extends JPanel{
    BufferedImage grass = GetImg.getMeImg("Grass");

    protected void paintComponent(Graphics g) {
        int curX = 0;
        int curY = 0;
        Graphics2D g2d = (Graphics2D) g;
        while (curY < getHeight()) {
            while (curX < getWidth()) {
                g2d.drawImage(grass,curX,curY,this);
                curX += grass.getWidth();
            }
            curY += grass.getHeight();
            curX =0;
        }
    }
}