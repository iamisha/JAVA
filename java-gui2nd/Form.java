
import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// MouseAdapter defines the both MouseListener and MouseMotionListener.
// one of the advantage of the MouseAdapter class is that we don't have to declare the remaining classes fucntion of the mouse event handling again and again.
public class Form extends MouseAdapter {
    // By using MouseAdapter, we can run override anymethod we want.
    JFrame f;
    JTextField tf;
    JTextField ts;

    public Form() {
        f = new JFrame("Mouse-Event-Handling");

        f.setSize(400, 400);
        tf = new JTextField();
        ts = new JTextField();
        tf.setBounds(100, 150, 170, 50);
        ts.setBounds(100, 190, 170, 50);
        f.add(tf);
        f.add(ts);

        f.addMouseListener(this);
        f.addMouseMotionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseEntered(MouseEvent e) {
        tf.setText("IN!");
    }

    public void mouseExited(MouseEvent e) {
        tf.setText("Mouse Exited");
    }

    public void mouseMoved(MouseEvent e) {
        String cord = "X:- " + e.getX() + " " + "Y:- " + e.getY();
        ts.setText(cord);
    }

    public static void main(String[] args) {
        new Form();
    }
}