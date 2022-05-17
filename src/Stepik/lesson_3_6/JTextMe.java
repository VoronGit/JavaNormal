package Stepik.lesson_3_6;

import javax.swing.*;
import java.awt.*;

public class JTextMe {
    public static void main(String[] args) {
        new MainFrame("JTextMe", 400, 250, new TextMain());
    }
}
class TextMain extends JPanel {
    JTextField field = new JTextField();
    JTextArea area = new JTextArea();
    {
        field.setEnabled(true);
        area.setFocusable(false);
        JButton button = new JButton("Ответить");
        JPanel panel = new JPanel();

        BoxLayout boxM = new BoxLayout(this, BoxLayout.LINE_AXIS);
        setLayout(boxM);

        add(Box.createHorizontalGlue());
        add(panel);
        add(Box.createHorizontalGlue());


        button.addActionListener(e -> {
            if (field.getText().length() > 0) {
                area.append(field.getText());
                area.append("\n");
                field.setText("");
            }
        });

        JPanel panelT = new JPanel();
        BoxLayout box = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        panel.setLayout(box);
        BoxLayout boxT = new BoxLayout(panelT, BoxLayout.LINE_AXIS);
        panelT.setLayout(boxT);
        JScrollPane pane = new JScrollPane(area);
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        field.setPreferredSize(new Dimension(350,20));
        field.setMaximumSize(new Dimension(350,20));
        panelT.setPreferredSize(new Dimension(350,100));
        panelT.setMaximumSize(new Dimension(350,100));

        panelT.add(pane);

        field.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelT.setAlignmentX(Component.CENTER_ALIGNMENT);


        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(field);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(panelT);
        panel.add(Box.createVerticalGlue());
    }
}