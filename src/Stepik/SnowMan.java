package Stepik;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;


class PaintSnowMan extends Canvas {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(7));
        g2d.draw(new Ellipse2D.Double(250,660,500,450));
        paintHand(g2d,30,450, 1);
        g2d.setColor(Color.white);
        g2d.fill(new Ellipse2D.Double(300,400,400,330));
        g2d.setColor(Color.black);
        g2d.draw(new Ellipse2D.Double(300,400,400,330));
        g2d.setColor(Color.white);
        g2d.fill(new Ellipse2D.Double(375,210,250,220));
        g2d.setColor(Color.black);
        g2d.draw(new Ellipse2D.Double(375,210,250,220));
        g2d.setColor(Color.white);
        g2d.fill(new Ellipse2D.Double(350,190,300,60));
        g2d.setColor(Color.black);
        g2d.draw(new Ellipse2D.Double(350,190,300,60));
        g2d.setColor(Color.white);
        g2d.fill(new RoundRectangle2D.Double(410, 50, 180, 150, 25, 25));
        g2d.setColor(Color.black);
        g2d.draw(new RoundRectangle2D.Double(410, 50, 180, 150, 25, 25));
        paintHand(g2d,30,450, 0);
        g2d.setStroke(new BasicStroke(5));
        paintSmallCircle(g2d, 520, 510);
        paintSmallCircle(g2d, 520, 560);
        paintSmallCircle(g2d, 520, 610);
        paintSmallCircle(g2d, 465, 360);
        paintSmallCircle(g2d, 500, 370);
        paintSmallCircle(g2d, 535, 370);
        paintSmallCircle(g2d, 570, 360);
        g2d.draw(new Ellipse2D.Double(485,280,25,25));
        g2d.draw(new Ellipse2D.Double(550,280,25,25));
        g2d.setColor(Color.white);
        g2d.fill(new Polygon(new int[]{520, 680, 525},new int[]{315,315,350},3));
        g2d.setColor(Color.black);
        g2d.draw(new Polygon(new int[]{520, 680, 525},new int[]{315,315,350},3));
        g2d.draw(new Line2D.Double(new Point(410,160), new Point(590, 160)));

    }
    public static void paintSmallCircle(Graphics2D g2d, int x, int y) {
        g2d.draw(new Ellipse2D.Double(x,y,20,20));
    }
    public static void paintHand(Graphics2D g2d, int x, int y, int dir) {
        int[] xCor = new int[]{x,x+5,x+45,x+30,x+40,x+60,x+320,x+315,x+60,x+20,x+15,x+45};
        int[] yCor = new int[]{y,y-15,y-5 ,y-40,y-45,y-5 ,y+50 ,y+75 ,y+15 ,y+40,y+30,y+10};

        if (dir == 1) {
            for (int i = 0; i < xCor.length; i++) {
                int temp = 1000 - xCor[i];
                xCor[i] = temp;
            }
        }

        g2d.setColor(Color.white);
        g2d.fill(new Polygon(xCor,yCor,12));
        g2d.setColor(Color.black);
        g2d.draw(new Polygon(xCor,yCor,12));
    }
}

public class SnowMan {
    public static void main(String[] args) {
        MainFrame.createMainFrame(new PaintSnowMan(), 1000, 1200);
    }
}
