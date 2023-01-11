
import java.awt.Component;

import javax.swing.*;
class BoxLayoutExam extends JFrame{
    
    JButton b1, b2, b3, b4, b5;

    BoxLayoutExam(){
        
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Long Named Button 4");
        b5 = new JButton("5");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        pack();
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BoxLayoutExam();
    }
}