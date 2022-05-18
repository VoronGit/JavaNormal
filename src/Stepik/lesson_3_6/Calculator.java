package Stepik.lesson_3_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Stepik.lesson_3_6.Calculator.defText;
import static Stepik.lesson_3_6.Calculator.text;

public class Calculator {
    static JTextField textField = new JTextField();
    static String defText = "0";
    static StringBuilder text = new StringBuilder();
    static Font font = new Font(null, Font.BOLD, 35);
    static String[] buttonList = new String[]{"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "C", "0", "=", "/"};

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);
        JPanel mainPanel = new JPanel();
        BoxLayout mainLayout = new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS);
        mainPanel.setLayout(mainLayout);

        JPanel textPanel = new JPanel();
        textPanel.setFocusable(false);
        textPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
        textField.setText(getTextForScreen(defText));
        textField.setFocusable(false);
        textField.setFont(font);

        textPanel.add(textField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setFocusable(true);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridLayout gridLayout = new GridLayout(4, 4);
        buttonPanel.setLayout(gridLayout);

        for (String buttonName : buttonList) {
            Button b = new Button(buttonName);
            b.setFont(font);
            b.setActionCommand(buttonName);
            b.addActionListener(new ButtonActHendler());
            b.setBackground(Color.WHITE);

            JPanel panel = new JPanel();
            BoxLayout box = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
            panel.setLayout(box);
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            panel.add(b);

            buttonPanel.add(panel);
        }

        mainPanel.add(textPanel);
        mainPanel.add(buttonPanel);

        frame.add(mainPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    static public String getTextForScreen(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 30 - text.length(); i++) {
            builder.append(" ");
        }
        builder.append(text);
        return builder.toString();
    }
}

class ButtonActHendler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        char key = e.getActionCommand().charAt(0);
        if (Character.isDigit(key)) {
            // Добавить проверку впереди стоящего ноля
            text.append(e.getActionCommand());
            Calculator.textField.setText(Calculator.getTextForScreen(String.valueOf(text)));
        } else {
            switch (key) {
                case 'C':
                    text.delete(0, text.length());
                    Calculator.textField.setText(Calculator.getTextForScreen(String.valueOf(defText)));
                    break;
                case '=':
                    // Добавить механизм расчета
                    Calculator.textField.setText(Calculator.getTextForScreen(String.valueOf(text)));
                    break;
                default:
                    if (text.indexOf(" ") != -1) {
                        text.delete(text.indexOf(" "), text.length());
                    }
                    text.append(" ");
                    text.append(key);
                    text.append(" ");
                    Calculator.textField.setText(Calculator.getTextForScreen(String.valueOf(text)));
            }
        }
    }
}
