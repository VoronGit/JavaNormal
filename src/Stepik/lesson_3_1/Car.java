package Stepik.lesson_3_1;

import java.awt.*;
import java.awt.geom.*;


class PaintCar extends Canvas {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(9));
        paintHull(g2d, 150, 200 , Color.YELLOW);
        paintWheel(g2d,190,360);
        paintWheel(g2d,700,360);
        paintFrontLight(g2d,950,300);
        g2d.draw(new Line2D.Double(495,290,540,290));
        paintFrontWindow(g2d,480,120);
        paintRearWindow(g2d,200,240);
    }
    public void paintWheel(Graphics2D g2d, int x, int y) {
        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(x,y,190,190));
        g2d.setColor(Color.WHITE);
        g2d.fill(new Ellipse2D.Double(x+55,y+55,80,80));
        g2d.setColor(Color.BLACK);
    }
    public void  paintHull(Graphics2D g2d, double x, double y, Color color) {
        Path2D path = new Path2D.Double();
        path.moveTo(x,y+40);
        path.curveTo(x+150,y-170,x+550,y-170,x+700,y+40);
        path.quadTo(x+910, y+60,x+910,y+200);
        path.quadTo(x+920,y+220,x+900,y+250);
        path.lineTo(x+760,y+250);
        path.curveTo(x+760,y+100,x+530,y+100,x+530,y+250);
        path.lineTo(x+250,y+250);
        path.curveTo(x+250,y+100,x+20,y+100,x+20,y+250);
        path.lineTo(x-50,y+250);
        path.quadTo(x-80,y+220,x-75,y+190);
        path.quadTo(x-80,y+190,x-60,y+160);
        path.quadTo(x-50,y+90,x,y+40);
        path.closePath();
        g2d.setColor(color);
        g2d.fill(path);
        g2d.setColor(Color.BLACK);
        g2d.draw(path);
    }
    public void paintFrontLight(Graphics2D g2d, double x, double y) {
        Path2D path = new Path2D.Double();
        path.moveTo(x,y);
        path.quadTo(x+60,y-10,x+80,y+50);
        path.quadTo(x+20,y+60,x,y);
        path.closePath();
        g2d.setColor(Color.WHITE);
        g2d.fill(path);
        g2d.setColor(Color.BLACK);
        g2d.draw(path);
    }
    public void paintFrontWindow(Graphics2D g2d, double x, double y) {
        Path2D path = new Path2D.Double();
        path.moveTo(x,y);
        path.lineTo(x,y+120);
        path.lineTo(x+320,y+120);
        path.quadTo(x+210,y,x,y);
        path.closePath();
        g2d.setColor(Color.WHITE);
        g2d.fill(path);
        g2d.setColor(Color.BLACK);
        g2d.draw(path);
    }
    public void paintRearWindow(Graphics2D g2d, double x, double y) {
        Path2D path = new Path2D.Double();
        path.moveTo(x,y);
        path.lineTo(x+240,y);
        path.lineTo(x+240,y-120);
        path.quadTo(x+100,y-110,x,y);
        path.closePath();
        g2d.setColor(Color.WHITE);
        g2d.fill(path);
        g2d.setColor(Color.BLACK);
        g2d.draw(path);
    }
}

public class Car {
    public static void main(String[] args) {
        MainFrame.createMainFrame(new PaintCar(), 1100, 600, "Car");
    }
}
