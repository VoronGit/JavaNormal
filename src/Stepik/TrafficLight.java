package Stepik;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

class MainFrame {
    public static void createMainFrame(Object obj) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("TrafficLight");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000, 1000));
        frame.setLocation(400, 20);
        frame.add((Component) obj);
        frame.pack();
        frame.setVisible(true);
    }
}
class PaintTrafficLight extends Canvas {
    public void paint(Graphics g) {
        Color white = new Color(255, 255, 255);
        Color whiteGrey = new Color(223, 223, 223);
        Color main = new Color(60,60,60);
        Color red = new Color(228, 6 , 19);
        Color yellow = new Color(254, 237 , 1);
        Color green = new Color(59, 170 , 53);
        setBackground(whiteGrey);
        g.setColor(main);
        g.fillArc(425,180, 150,100, 30,120);
        g.setColor(whiteGrey);
        g.fillRect(410,205,180,520);
        g.setColor(main);
        g.fillRoundRect(433,205,134,10, 5, 5);
        g.fillRoundRect(410,220,180,520, 25, 25);
        g.fillRoundRect(460,750,80,100, 15, 15);
        g.setColor(white);
        g.fillArc(425, 235, 150, 150, 0, 180);
        g.fillArc(425, 395, 150, 150, 0, 180);
        g.fillArc(425, 560, 150, 150, 0, 180);
        g.setColor(main);
        g.fillArc(425, 250, 150, 150, 0, 180);
        g.fillArc(425, 410, 150, 150, 0, 180);
        g.fillArc(425, 575, 150, 150, 0, 180);
        g.setColor(red);
        g.fillOval(435, 255, 130, 130);
        g.setColor(yellow);
        g.fillOval(435, 415, 130, 130);
        g.setColor(green);
        g.fillOval(435, 580, 130, 130);
    }
}

public class TrafficLight {
    public static void main(String[] args) {
        MainFrame.createMainFrame(new PaintTrafficLight());
    }
}
