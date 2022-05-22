/*
 * Created by JFormDesigner on Thu May 19 20:32:49 EEST 2022
 */

package Stepik.lesson_3_7;

import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainForm {
    public static void main(String[] args) {
        new  Form();
    }
}


/**
 * @author unknown
 */
public class Form extends JFrame {
    public Form() {
        initComponents();
    }

    boolean flag = false;

    private void ok(ActionEvent e) {
        JOptionPane optionPane = new JOptionPane();
        optionPane.showMessageDialog(null,"ФИО: " + textField1.getText() + "\n"
                                                            +   "Возраст: " + spinner1.getValue() + "\n"
                                                            +   "Категория прав: " + comboBox1.getSelectedItem() + "\n"
                                                            +   "Номер телефона: " + textField2.getText() + "\n"
                                                            +   "Почта: " + textField3.getText() + "\n"
                                                            +   "Марка: " + ((flag) ? textField4.getText() : comboBox2.getSelectedItem()) + "\n"
                                                            +   "Модель: " + textField5.getText() + "\n"
                                                            +   "Максимальная скорость: " + textField6.getText() + "\n"
                                                            +   "Год выпуска: " + textField7.getText() + "\n"
                                                            +   "Пробег: " + textField8.getText() + "\n"

            );
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        panel1 = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        label7 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        spinner1 = new JSpinner();
        label4 = new JLabel();
        comboBox1 = new JComboBox<>();
        label5 = new JLabel();
        textField3 = new JTextField();
        label6 = new JLabel();
        textField2 = new JTextField();
        label8 = new JLabel();
        label9 = new JLabel();
        comboBox2 = new JComboBox<>();
        checkBox1 = new JCheckBox();
        textField4 = new JTextField();
        label10 = new JLabel();
        textField5 = new JTextField();
        label11 = new JLabel();
        textField6 = new JTextField();
        label12 = new JLabel();
        textField7 = new JTextField();
        label13 = new JLabel();
        textField8 = new JTextField();
        okButton = new JButton();
        buttonBar = new JPanel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            setVisible(true);
            dialogPane.setLayout(new BorderLayout());

            //======== panel1 ========
            {
                panel1.setLayout(new BorderLayout());

                //======== contentPanel ========
                {
                    contentPanel.setLayout(new MigLayout(
                            "insets dialog,novisualpadding,hidemode 3,alignx left",
                            // columns
                            "[fill]" +
                                    "[fill]" +
                                    "[fill]" +
                                    "[fill]" +
                                    "[57,fill]" +
                                    "[fill]" +
                                    "[fill]" +
                                    "[fill]" +
                                    "[0,fill]" +
                                    "[209,fill]" +
                                    "[fill]" +
                                    "[fill]" +
                                    "[fill]" +
                                    "[fill]" +
                                    "[fill]" +
                                    "[fill]",
                            // rows
                            "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]" +
                                    "[]"));

                    //---- label1 ----
                    label1.setText("\u0424\u043e\u0440\u043c\u0430 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438");
                    label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 6f));
                    label1.setHorizontalAlignment(SwingConstants.CENTER);
                    contentPanel.add(label1, "cell 4 0 5 1,align center center,grow 0 0");

                    //---- label7 ----
                    label7.setText("\u0412\u043e\u0434\u0438\u0442\u0435\u043b\u044c");
                    label7.setHorizontalAlignment(SwingConstants.CENTER);
                    label7.setFont(label7.getFont().deriveFont(label7.getFont().getStyle() | Font.BOLD));
                    contentPanel.add(label7, "cell 4 1,aligny center,growy 0");

                    //---- label2 ----
                    label2.setText("\u0424\u0418\u041e");
                    contentPanel.add(label2, "cell 0 2");
                    contentPanel.add(textField1, "cell 2 2 10 1");

                    //---- label3 ----
                    label3.setText("\u0412\u043e\u0437\u0440\u0430\u0441\u0442");
                    contentPanel.add(label3, "cell 0 3");
                    contentPanel.add(spinner1, "cell 2 3");

                    //---- label4 ----
                    label4.setText("\u041a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u044f \u043f\u0440\u0430\u0432");
                    contentPanel.add(label4, "cell 0 4");

                    //---- comboBox1 ----
                    comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                            "A",
                            "B",
                            "C",
                            "D",
                            "E",
                            "\u041d\u0435\u0442"
                    }));
                    contentPanel.add(comboBox1, "cell 2 4,aligny center,grow 100 0");

                    //---- label5 ----
                    label5.setText("\u041d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430");
                    contentPanel.add(label5, "cell 0 5");

                    //---- textField3 ----
                    textField3.setToolTipText("+38(0");
                    contentPanel.add(textField3, "cell 2 5 2 1");

                    //---- label6 ----
                    label6.setText("\u041f\u043e\u0447\u0442\u0430");
                    contentPanel.add(label6, "cell 0 6");

                    //---- textField2 ----
                    textField2.setToolTipText("email@email.com");
                    contentPanel.add(textField2, "cell 2 6 2 1");

                    //---- label8 ----
                    label8.setText("\u0410\u0432\u0442\u043e\u043c\u043e\u0431\u0438\u043b\u044c");
                    label8.setFont(label8.getFont().deriveFont(Font.BOLD));
                    contentPanel.add(label8, "cell 4 8,align center center,grow 0 0");

                    //---- label9 ----
                    label9.setText("\u041c\u0430\u0440\u043a\u0430");
                    contentPanel.add(label9, "cell 0 9");

                    //---- comboBox2 ----
                    comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                            "BMW",
                            "Hundai",
                            "Lanos",
                            "Mersedes",
                            "Audi",
                            "Opel"
                    }));
                    contentPanel.add(comboBox2, "cell 2 9");

                    //---- checkBox1 ----
                    checkBox1.setText("\u0414\u0440\u0443\u0433\u0430\u044f");
                    checkBox1.addChangeListener(e -> {
                        textField4.setEnabled(checkBox1.isSelected());
                        comboBox2.setEnabled(!checkBox1.isSelected());
                        flag = checkBox1.isSelected();
                    });
                    contentPanel.add(checkBox1, "cell 3 9 9 1");

                    //---- textField4 ----
                    textField4.setEnabled(false);
                    contentPanel.add(textField4, "cell 3 9 9 1");

                    //---- label10 ----
                    label10.setText("\u041c\u043e\u0434\u0435\u043b\u044c");
                    contentPanel.add(label10, "cell 0 10");
                    contentPanel.add(textField5, "cell 2 10 2 1");

                    //---- label11 ----
                    label11.setText("\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c");
                    contentPanel.add(label11, "cell 0 11");
                    contentPanel.add(textField6, "cell 2 11 2 1");

                    //---- label12 ----
                    label12.setText("\u0413\u043e\u0434 \u0432\u044b\u043f\u0443\u0441\u043a\u0430");
                    contentPanel.add(label12, "cell 0 12");
                    contentPanel.add(textField7, "cell 2 12 2 1");

                    //---- label13 ----
                    label13.setText("\u041f\u0440\u043e\u0431\u0435\u0433");
                    contentPanel.add(label13, "cell 0 13");
                    contentPanel.add(textField8, "cell 2 13 2 1");

                    //---- okButton ----
                    okButton.setText("\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u044c");
                    okButton.addActionListener(e -> ok(e));
                    contentPanel.add(okButton, "cell 4 14,aligny center,growy 0");
                }
                panel1.add(contentPanel, BorderLayout.CENTER);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                        "insets dialog,alignx right",
                        // columns
                        "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[button,fill]",
                        // rows
                        null));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel panel1;
    private JPanel contentPanel;
    private JLabel label1;
    private JLabel label7;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JSpinner spinner1;
    private JLabel label4;
    private JComboBox<String> comboBox1;
    private JLabel label5;
    private JTextField textField3;
    private JLabel label6;
    private JTextField textField2;
    private JLabel label8;
    private JLabel label9;
    private JComboBox<String> comboBox2;
    private JCheckBox checkBox1;
    private JTextField textField4;
    private JLabel label10;
    private JTextField textField5;
    private JLabel label11;
    private JTextField textField6;
    private JLabel label12;
    private JTextField textField7;
    private JLabel label13;
    private JTextField textField8;
    private JButton okButton;
    private JPanel buttonBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
