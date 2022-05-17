package Stepik.lesson_3_6;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxMe {
    public static void main(String[] args) {
        new MainFrame("Clicker", 180, 230, new ComboMain());
    }
}
class ComboMain extends JPanel {
    String[] list = {"Красный","Оранжевый","Желтый","Зеленый","Голубой","Синий","Фиолетовый"};
    JComboBox comboBox = new JComboBox(list);
    JTextField field = new JTextField();
    JLabel label = new JLabel();
    boolean isChecked;
    {
        label.setText("Ответ: 0");
        field.setEnabled(false);
        JButton button = new JButton("Ответить");
        JPanel panel = new JPanel();
        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Свой вариант");
        checkBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                field.setEnabled(checkBox.isSelected());
            }
        });
        BoxLayout boxM = new BoxLayout(this, BoxLayout.LINE_AXIS);
        setLayout(boxM);

        add(Box.createHorizontalGlue());
        add(panel);
        add(Box.createHorizontalGlue());


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    label.setText("Ответ: " + field.getText());
                } else {
                    label.setText("Ответ: " + comboBox.getSelectedItem());
                }
                label.setVisible(true);
            }
        });
        comboBox.setMaximumSize(new Dimension(160,10));
        field.setMaximumSize(new Dimension(160,10));
        label.setVisible(false);
        BoxLayout box = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        panel.setLayout(box);

        comboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        checkBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        field.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(comboBox);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(checkBox);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(field);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(label);
        panel.add(Box.createVerticalGlue());
    }
}