package Stepik.lesson_3_6;

import javax.swing.*;
import java.awt.*;

public class JRadioMe {
    public static void main(String[] args) {
        new MainFrame("Clicker", 180, 230, new RadioMain());
    }
}

class RadioMain extends JPanel {
    String[] list = {"Весна", "Лето", "Осень", "Зима"};
    ButtonGroup group = new ButtonGroup();
    JLabel label = new JLabel();

    {
        label.setText("Ответ: 0");
        JButton button = new JButton("Ответить");
        JPanel panel = new JPanel();

        BoxLayout boxM = new BoxLayout(this, BoxLayout.LINE_AXIS);
        setLayout(boxM);

        add(Box.createHorizontalGlue());
        add(panel);
        add(Box.createHorizontalGlue());

        label.setVisible(false);
        BoxLayout box = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        panel.setLayout(box);

        JPanel panelRad = new JPanel();
        BoxLayout boxRad = new BoxLayout(panelRad, BoxLayout.PAGE_AXIS);
        panelRad.setLayout(boxRad);

        panelRad.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        for(String name : list) {
            JRadioButton r = new JRadioButton(name);
            r.setActionCommand(name);
            group.add(r);
            panelRad.add(r);
            r.getModel().setSelected(true);
        }
        button.addActionListener(e -> {
            label.setText("Ответ: " + group.getSelection().getActionCommand());
            label.setVisible(true);
        });
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(panelRad);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(label);
        panel.add(Box.createVerticalGlue());
    }
}