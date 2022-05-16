package Stepik.lesson_3_6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class NewSlider{
    public static void main(String[] args) {
        new MainFrame("NewSlider", 600, 200, new SliderPanel());
    }
}
class SliderPanel extends JPanel {
    JLabel label = new JLabel("Message!");
    {
        BoxLayout box = new BoxLayout(this, BoxLayout.LINE_AXIS);
        JScrollBar bar = new JScrollBar();
        bar.setMinimum(5);
        bar.setMaximum(100);
        bar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setFont(new Font(null, Font.ITALIC, e.getValue()));
            }
        });
        setLayout(box);
        add(Box.createRigidArea(new Dimension(50,0)));
        add(label);
        add(Box.createHorizontalGlue());
        add(bar);
    }
}