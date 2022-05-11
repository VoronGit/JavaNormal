package Stepik;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;


public class MovingLikeAllPlanets {
    public static HashSet<Planet> planets= new HashSet<>();
    public static void main(String[] args) {
            planets.add(new Planet("mercury",50,1.8));
            planets.add(new Planet("venus",90,1));
            planets.add(new Planet("earth",150,0.8));
            planets.add(new Planet("mars",220,1.2));
            planets.add(new Planet("jupiter",300,1.5));
            planets.add(new Planet("saturn",380,1.3));
            planets.add(new Planet("uran",450,0.8));
            planets.add(new Planet("neptune",490,0.9));
            MainFrame.createMainFrame(new MoveLikeAllPlanets(), 1000, 1000, "MovingImage");
    }
}

class MoveLikeAllPlanets extends JPanel {
    private final BufferedImage sun;

    public MoveLikeAllPlanets() {
        try {
            sun = ImageIO.read(new File("./src/Stepik/SunAndPlanets/Sun.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Timer timer = new Timer(40, e -> {
            for (Planet planet : MovingLikeAllPlanets.planets) {
                planet.ang += planet.angChange;
                if(planet.ang > 360) planet.ang = 0;
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        setBackground(Color.black);
        g2d.drawImage(sun, getWidth() / 2 - sun.getWidth() / 2, getHeight() / 2 - sun.getHeight() / 2, this);
        for (Planet planet : MovingLikeAllPlanets.planets) {
            int xPos = (int) (planet.r * Math.cos(planet.ang * Math.PI / 180)) + getWidth() / 2;
            int yPos = (int) (planet.r * Math.sin(planet.ang * Math.PI / 180)) + getHeight() / 2;
            g2d.drawImage(planet.img, xPos - planet.img.getWidth()/2, yPos - planet.img.getHeight()/2, this);
        }
        g2d.dispose();
    }
}

class Planet {
    protected BufferedImage img;
    protected int r;
    protected double ang;
    protected double angChange;
    public Planet (String img, int radius, double angChange){
        this(img,radius,0,angChange);
    }
    public Planet (String img, int radius, double angeStart, double angChange){
        try {
            this.img = ImageIO.read(new File("./src/Stepik/SunAndPlanets/"+img+".png"));
        } catch (IOException e) {
            try {
                this.img = ImageIO.read(new File("./src/Stepik/SunAndPlanets/sun.png"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        this.r = radius;
        this.ang = angeStart;
        this.angChange = angChange;
    }
}