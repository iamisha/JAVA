import javax.swing.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowExam2nd extends JFrame implements WindowListener, ActionListener {
    JButton btn;

    public WindowExam2nd() {
        btn = new JButton("click");
        setTitle("JOptionPane- Types");
        // btn.setBounds(200, 100, 100, 50);
        add(btn);
        btn.addActionListener(this);
        addWindowListener(this);
        pack(); // it sizes the frame so that all it's contents are at or above their preffered
                // sizes... it is the alternative of the setBounds or the setSize...
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String ip = JOptionPane.showInputDialog(null, "enter an integer value");
        int num = Integer.parseInt(ip);
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "even");
        } else {
            JOptionPane.showMessageDialog(null, "odd");
        }
    }

    public void windowClosing(WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(null, "do you really want to exit the ? ", "closing the frame",
                JOptionPane.OK_CANCEL_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public static void main(String[] args) {
        new WindowExam2nd();
    }
}
