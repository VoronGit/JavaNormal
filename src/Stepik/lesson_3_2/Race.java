package Stepik.lesson_3_2;

import Stepik.lesson_3_1.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class Race {
    public static HashSet<Cars> cars = new HashSet<>();
    public static void main(String[] args) {
        File dir = new File("./src/Stepik/lesson_3_2/Cars");
        File[] arrFiles = dir.listFiles();
        java.util.List<File> lst = Arrays.asList(arrFiles);
        for (File img : lst) {
            cars.add(new Cars(img));
        }
        MainFrame.createMainFrame(new MakeThemRace(), 1000, Cars.getMaxHeight() + 100, "MovingImage");
    }
}
class MakeThemRace extends JPanel {
    Timer timer = null;
    static public String winner = "";
    Color color = new Color(0,0,0,0);
    public MakeThemRace() {
        timer  = new Timer(60, e -> {
            for (Cars car : Race.cars) {
                car.x += (int) (Math.random() * 5) + 1;
                if (car.x + car.img.getWidth() >= getWidth() && car.x > 20) {
                    timer.stop();
                    winner = car.name;
                    color = new Color(0,0,0);
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
        g2d.drawImage(car.img, car.x, getHeight()/2 - Cars.getMaxHeight()/2 + car.getCarHeight() + car.getCarPos(), this);
        }
        g2d.setColor(color);
        g2d.setFont(new Font(null,Font.BOLD,40));
        g2d.drawString(MakeThemRace.winner + " is a winner!", getWidth()/2 - 150, getHeight()/2);
        g2d.dispose();
    }
}

class Cars {
    static public int carMax = 0;
    protected BufferedImage img;
    protected int line;
    protected String name;
    protected int x;
    static private int nextLine = 1;
    public Cars (File img){
        try {
            this.img = ImageIO.read(img);
        } catch (IOException e) {
            try {
                this.img = ImageIO.read(new File("./src/Stepik/SunAndPlanets/sun.png"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (carMax < this.img.getHeight() + 10) carMax = this.img.getHeight() + 10;
        this.x = 0;
        this.name = img.getName().substring(0, img.getName().lastIndexOf ("."));
        this.line = nextLine;
        nextLine++;
    }

    public static int getNextLine() {
        return nextLine;
    }
    public static int getMaxHeight() {
        return carMax*(nextLine-1);
    }
    public int getCarHeight() {
        return carMax*(line-1);
    }
    public int getCarPos() {
        return carMax/2 - this.img.getHeight()/2;
    }
}