package Stepik;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public class Race {
    public static HashSet<Cars> cars = new HashSet<>();
    public static void main(String[] args) {
        cars.add(new Cars("Ferrari"));
        cars.add(new Cars("Passat"));
        cars.add(new Cars("Passat"));
        cars.add(new Cars("Camry"));
        MainFrame.createMainFrame(new MakeThemRace(), 1000, Cars.fullCarsHeight + 60, "MovingImage");
    }
}
class MakeThemRace extends JPanel {
    Timer timer = null;
    public MakeThemRace() {
        timer  = new Timer(40, e -> {
            for (Cars car : Race.cars) {
                car.x += (int) (Math.random() * 5) + 1;
                if (car.x + car.img.getWidth() >= 1000) {
                    timer.stop();
                }
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        setBackground(Color.white);
        for (Cars car : Race.cars) {
        g2d.drawImage(car.img, car.x, getHeight()/2 - Cars.fullCarsHeight/2 + car.carMax * (car.line - 1) + car.carMax/2 - car.img.getHeight()/2, this);
        }
        g2d.dispose();
    }
}

class Cars {
    public int carMax = 70;
    protected BufferedImage img;
    protected int line;
    protected String name;
    public static int fullCarsHeight = 0;
    protected int x;
    static private int nextLine = 1;
    public Cars (String img){
        try {
            this.img = ImageIO.read(new File("./src/Stepik/Cars/"+img+".png"));
        } catch (IOException e) {
            try {
                this.img = ImageIO.read(new File("./src/Stepik/SunAndPlanets/sun.png"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        this.x = 0;
        this.fullCarsHeight += carMax;
        this.name = img;
        this.line = nextLine;
        nextLine++;
    }

    public static int getNextLine() {
        return nextLine;
    }
}
