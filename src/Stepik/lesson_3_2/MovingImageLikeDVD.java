package Stepik.lesson_3_2;

import Stepik.lesson_3_1.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class MovingImageLikeDVD {
    public static void main(String[] args) {
        MainFrame.createMainFrame(new MoveImageLikeDVD(), 1400, 800, "MovingImage");
    }
}
class MoveImageLikeDVD extends JPanel {
    private BufferedImage bg;
    private boolean top = true;
    private boolean bottom = false;
    private boolean right = false;
    private boolean left = true;
    private int yOffset = 1;
    private int xOffset = 1;
    private int Delta = 5;
    private int r = 7;
    ;

    public MoveImageLikeDVD() {
        getImage();

        Timer timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (left) {
                    xOffset += Delta;
                    if (xOffset > getWidth() - bg.getWidth()) {
                        xOffset = getWidth() - bg.getWidth();
                        left = false;
                        right = true;
                        getImage();

                    }
                } else if (right) {
                    xOffset -= Delta;
                    if (xOffset < 0) {
                        xOffset = 0;
                        right = false;
                        left = true;
                        getImage();
                    }
                }
                if (top) {
                    yOffset += Delta;
                    if (yOffset > getHeight() - bg.getHeight()) {
                        yOffset = getHeight() - bg.getHeight();
                        top = false;
                        bottom = true;
                        getImage();
                    }
                } else if (bottom) {
                    yOffset -= Delta;
                    if (yOffset < 0) {
                        yOffset = 0;
                        bottom = false;
                        top = true;
                        getImage();
                    }
                }
                repaint();
            }
        });
        timer.start();
    }

    public void getImage() {
        while (true) {
            int temp = (int) (Math.random() * 6 + 1);
            if (temp != r) {
                r = temp;
                break;
            }
        }
        try {
            bg = ImageIO.read(new File("./src/Stepik/lesson_3_2/"+r+".png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int xPos = xOffset;
        int yPos = yOffset;
        g2d.drawImage(bg, xPos, yPos, this);
        g2d.dispose();
    }
}
