package Stepik.lesson_3_2;

import Stepik.lesson_3_1.MainFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingImageOnRectangle {
    public static void main(String[] args) {
        MainFrame.createMainFrame(new MoveImageOnRectangle(), 500, 500, "MovingImage");
    }
}

class MoveImageOnRectangle extends JPanel {
    private BufferedImage bg;
    private boolean top = true;
    private boolean bottom = false;
    private boolean right = false;
    private boolean left = false;
    private int yOffset = 0;
    private int xOffset = 0;
    private int Delta = 5;
    ;

    public MoveImageOnRectangle() {
        try {
            bg = ImageIO.read(new File("./src/Stepik/lesson_3_2/1.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Timer timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (top) {
                    xOffset += Delta;
                    if (xOffset > getWidth() - bg.getWidth()) {
                        xOffset = getWidth() - bg.getWidth();
                        top = false;
                        right = true;
                    }
                } else if (right) {
                    yOffset += Delta;
                    if (yOffset > getHeight() - bg.getHeight()) {
                        yOffset = getHeight() - bg.getHeight();
                        right = false;
                        bottom = true;
                    }
                } else if (bottom) {
                    xOffset -= Delta;
                    if (xOffset < 0) {
                        xOffset = 0;
                        bottom = false;
                        left = true;
                    }
                } else if (left) {
                    yOffset -= Delta;
                    if (yOffset < 0) {
                        yOffset = 0;
                        left = false;
                        top = true;
                    }
                }
                repaint();
            }
        });
        timer.start();
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
