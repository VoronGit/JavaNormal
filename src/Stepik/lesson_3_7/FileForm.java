package Stepik.lesson_3_7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.FileFilter;

class Main {
    public static void main(String[] args) {
        new FileForm();
    }
}

public class FileForm extends JFrame {
    public FileForm() {
        initComponents();
    }

    static JLabel label2 = new JLabel();
    static JTextArea textArea1 = new JTextArea();

    private void initComponents() {

        panel1 = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();
        panel4 = new JPanel();
        button2 = new JButton();
        panel3 = new JPanel();
        button3 = new JButton();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();

        //======== this ========
        setMinimumSize(new Dimension(900, 500));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ActionListenerForMe buttonAction = new ActionListenerForMe();
        //======== panel1 ========
        {
            panel1.setBorder(new EmptyBorder(10, 20, 10, 20));
            panel1.setMinimumSize(new Dimension(800, 600));
            panel1.setMaximumSize(new Dimension(1566, 600));
            panel1.setPreferredSize(new Dimension(476, 40));
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

            //---- button1 ----
            button1.setText("\u041e\u0442\u043a\u0440\u044b\u0442\u044c \u0444\u0430\u0439\u043b");
            button1.setActionCommand("1");
            button1.addActionListener(buttonAction);
            panel1.add(button1);

            //---- label1 ----
            label1.setText("\u0424\u0430\u0439\u043b: ");
            label1.setBorder(new EmptyBorder(0, 20, 0, 0));
            panel1.add(label1);

            //---- label2 ----
            label2.setText("");
            label2.setBorder(new EmptyBorder(0, 20, 0, 0));
            label2.setMaximumSize(new Dimension(160, 14));
            panel1.add(label2);

            //======== panel4 ========
            {
                panel4.setMaximumSize(new Dimension(10000, 0));
                panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
            }
            panel1.add(panel4);

            //---- button2 ----
            button2.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c");
            button2.setActionCommand("2");
            button2.addActionListener(buttonAction);
            panel1.add(button2);

            //======== panel3 ========
            {
                panel3.setMaximumSize(new Dimension(10, 0));
                panel3.setMinimumSize(new Dimension(10, 0));
                panel3.setPreferredSize(new Dimension(10, 0));
                panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
            }
            panel1.add(panel3);

            //---- button3 ----
            button3.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u043a\u0430\u043a");
            button3.setActionCommand("3");
            button3.addActionListener(buttonAction);
            panel1.add(button3);
        }
        contentPane.add(panel1);

        //======== panel2 ========
        {
            panel2.setBorder(new EmptyBorder(0, 20, 20, 20));
            panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }
            panel2.add(scrollPane1);
        }
        contentPane.add(panel2);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JLabel label1;
    private JPanel panel4;
    private JButton button2;
    private JPanel panel3;
    private JButton button3;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

class ActionListenerForMe implements ActionListener {
    String path;
    int result;
    @Override
    public void actionPerformed(ActionEvent e) {
        String key = e.getActionCommand();
        JFileChooser fileChooser = new JFileChooser("./src/Stepik/lesson_3_7");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new ExcelFileFilter("txt"));
        switch (key) {
            case "1":
                fileChooser.setApproveButtonText("Открыть");
                result = fileChooser.showOpenDialog(null);
                if (result == 0) {
                    File file = fileChooser.getSelectedFile();
                    path = file.getPath();
                    try {
                        FileReader fileReader = new FileReader(file);
                        Scanner scan = new Scanner(fileReader);
                        StringBuilder mainText = new StringBuilder();
                        while(scan.hasNextLine()) {
                            mainText.append(scan.nextLine());
                            mainText.append("\n");
                        }
                        fileReader.close();
                        FileForm.label2.setText(file.getName());
                        String text;
                        if (mainText.equals("")) text = " ";
                        else text = mainText.toString();
                        FileForm.textArea1.setText(text);
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                break;
            case "2":
                if (path == null) {
                    fileChooser.setApproveButtonText("Сохранить");
                    result = fileChooser.showOpenDialog(null);
                    if (result == 0) {
                        path = fileChooser.getCurrentDirectory() + "/" + fileChooser.getSelectedFile().getName();
                        try {
                            FileWriter fileWriter = new FileWriter(path, false);
                            fileWriter.append(FileForm.textArea1.getText());
                            fileWriter.close();
                            FileForm.label2.setText(fileChooser.getSelectedFile().getName());
                        } catch (FileNotFoundException ex) {
                            throw new RuntimeException(ex);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    break;
                } else {
                    try {
                        FileWriter fileWriter = new FileWriter(path, false);
                        fileWriter.append(FileForm.textArea1.getText());
                        fileWriter.close();
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                break;
            case "3":
                fileChooser.setApproveButtonText("Сохранить как");
                result = fileChooser.showOpenDialog(null);
                if (result == 0) {
                    path = fileChooser.getCurrentDirectory() + "/" + fileChooser.getSelectedFile().getName();
                    try {
                        FileWriter fileWriter = new FileWriter(path, false);
                        fileWriter.append(FileForm.textArea1.getText());
                        fileWriter.close();
                        FileForm.label2.setText(fileChooser.getSelectedFile().getName());
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + key);
        }
    }
}
class ExcelFileFilter extends FileFilter {

    String ext;
    ExcelFileFilter(String ext) {

        this.ext = ext;
    }
    public boolean accept(File file) {
        if (file.isDirectory())
        {
            return true;
        }
        String fileName = file.getName();
        int index = fileName.lastIndexOf('.');
        if (index > 0 && index < fileName.length() - 1)
        {
            String extension = fileName.substring(index + 1).toLowerCase();
            if (extension.equals(ext))
                return true;
        }
        return false;
    }
    public String getDescription() {

        if (ext.equals("txt"))
        {
            return "Текстовый файл (*.txt)";
        }
        return "";
    }
}