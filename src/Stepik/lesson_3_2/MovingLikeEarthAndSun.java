package Stepik.lesson_3_2;

import Stepik.lesson_3_1.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class MovingLikeEarthAndSun {
    public static void main(String[] args) {
        MainFrame.createMainFrame(new MoveLikeAPlanet(), 800, 800, "MovingImage");
    }
}


class MoveLikeAPlanet extends JPanel {
    private BufferedImage sun;
    private BufferedImage earth;
    private int rEarth = 200;
    private int angEarth = 0;
    ;

    public MoveLikeAPlanet() {
        getImage();

        Timer timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angEarth++;
                if (angEarth > 360) {
                    angEarth = 0;
                }
                repaint();
            }
        });
        timer.start();
    }

    public void getImage() {
        try {
            sun = ImageIO.read(new File("./src/Stepik/lesson_3_2/SunAndPlanets/Sun.png"));
            earth = ImageIO.read(new File("./src/Stepik/lesson_3_2/SunAndPlanets/earth.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        setBackground(Color.black);
        int xPosEarth = (int) (rEarth * Math.cos(angEarth*Math.PI/180)) + getWidth()/2;
        int yPosEarth = (int) (rEarth * Math.sin(angEarth*Math.PI/180)) + getHeight()/2;
        g2d.drawImage(sun, getWidth()/2 - sun.getWidth()/2, getHeight()/2 - sun.getHeight()/2, this);
        g2d.drawImage(earth, xPosEarth -25, yPosEarth-25, this);
        g2d.dispose();
    }
}