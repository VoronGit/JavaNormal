package Stepik.lesson_3_6;
import javax.swing.*;
import java.awt.*;
public class JLableText {
    public static void main(String[] args) {
        new MainFrame("", 800, 200, new NewPanel());
    }
}
class NewPanel extends JLabel {
    {
        setText("Моя первая надпись!");
        setFont(new Font(null,Font.ITALIC,50));
    }
}