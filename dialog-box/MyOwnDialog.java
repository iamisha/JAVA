import javax.swing.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;

class MyDialog{
    static JDialog d;
    static JLabel label;
    static JButton btn;

    public static void showMessageDialog(JFrame f, String msg, String title){

        d = new JDialog(f, title);
        label =new JLabel(msg);
        btn = new JButton("ok");
        d.setSize(200, 120);
       
        // setting the componets in boxlayout
        d.setLayout(new BoxLayout(d.getContentPane(), BoxLayout.Y_AXIS));
        // sets horizontally in center
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        d.add(Box.createRigidArea(new Dimension(0, 20)));
        d.add(label);
        // to add the space between the label and the button
        d.add(Box.createRigidArea(new Dimension(0, 20)));
        d.add(btn);
       
        d.setVisible(true);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d.setVisible(false);
            }
        });

        //sets the location of the dialog box relative to the component;
       d.setLocationRelativeTo(f);
    }
}
public class MyOwnDialog extends JFrame implements ActionListener {
    JButton b;

    public MyOwnDialog(){
        setSize(300, 400);
        b = new JButton("click");
        add(b);
        b.addActionListener(this);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        MyDialog.showMessageDialog(this, "this is message dialog", "title");
    }

    public static void main(String [] args){
        new MyOwnDialog();
    }
    
}
