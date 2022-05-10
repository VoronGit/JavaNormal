package Stepik;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingImage {
    public static void main(String[] args) {
        MainFrame.createMainFrame(new MoveImage(), 500, 500, "MovingImage");
    }
}

class MoveImage extends JPanel {
    private BufferedImage bg;
    private int yOffset = 0;
    private int xOffset = 0;
    private int yDelta = 5;
    private int xDelta = yDelta;

    public MoveImage() {
        try {
            bg = ImageIO.read(new File("./src/Stepik/1.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Timer timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yOffset += yDelta;
                xOffset += xDelta;
                if (yOffset > getHeight() || xOffset > getWidth()) {
                    yOffset = 0;
                    xOffset = 0;
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