package Stepik.lesson_3_6;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spinner {
    public static void main(String[] args) {
        new MainFrame("Clicker", 160, 160, new SpinnerMain());
    }
}
class SpinnerMain extends JPanel {
    SpinnerListModel list = new SpinnerListModel(new String[]{"1","2","3","4","5","6","7","8","9","10"});
    JSpinner spinner = new JSpinner(list);
    JLabel label = new JLabel();
    {
        label.setText("Clicks count: 0");
        JButton button = new JButton("Ответить");
        JPanel panel = new JPanel();
        BoxLayout boxM = new BoxLayout(this, BoxLayout.LINE_AXIS);
        setLayout(boxM);
        add(Box.createHorizontalGlue());
        add(panel);
        add(Box.createHorizontalGlue());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Ответ: " + spinner.getValue());
                label.setVisible(true);
            }
        });
        spinner.setMaximumSize(new Dimension(160,10));
        label.setVisible(false);
        BoxLayout box = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        spinner.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setLayout(box);
        panel.add(Box.createVerticalGlue());
        panel.add(spinner);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(label);
        panel.add(Box.createVerticalGlue());
    }
}