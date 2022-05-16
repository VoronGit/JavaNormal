package Stepik.lesson_3_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clicker {
    public static void main(String[] args) {
        new MainFrame("Clicker", 600, 600, new ClickMain());
    }
}
class ClickMain extends JPanel {
    JLabel label = new JLabel();
    int clicksNum;
    {
        label.setText("Clicks count: 0");
        JButton button = new JButton("ClickMe");
        BoxLayout box = new BoxLayout(this, BoxLayout.LINE_AXIS);
        setLayout(box);
        JPanel panel = new JPanel();
        BoxLayout box2 = new BoxLayout(panel, BoxLayout.Y_AXIS);
        add(Box.createHorizontalGlue());
        add(panel);
        panel.setLayout(box2);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicksNum++;
                label.setText("Clicks count: " + clicksNum);
            }
        });
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(button);
        panel.add(Box.createHorizontalGlue());
    }
}