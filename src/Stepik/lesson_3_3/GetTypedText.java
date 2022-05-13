package Stepik.lesson_3_3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GetTypedText extends JFrame {
     public static void main(String[] args) {
        new MainFrameExt("GetTypedText",600,200);
    }
}
class MainFrameExt extends JFrame{
    TextArea textArea;
    public MainFrameExt (String title, int x, int y) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                writeToFile(textArea.getText());
            }
        });
        setDefaultLookAndFeelDecorated(true);
        setTitle(title);
        setPreferredSize(new Dimension(x,y));
        textArea = new TextArea();
        add(textArea);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void writeToFile(String text){
        try(FileWriter writer = new FileWriter("."+File.separator+"src"+File.separator+"Stepik"+File.separator+"lesson_3_3"+File.separator+"logs"+File.separator+"textLog.txt", false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
