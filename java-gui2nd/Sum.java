
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

public class Sum implements MouseListener, MouseMotionListener {
    JFrame f;
    JTextField tf;
    JTextField ts;

    public Sum() {
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

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public static void main(String[] args) {
        new Sum();
    }
}