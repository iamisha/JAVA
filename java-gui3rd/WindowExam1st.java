import javax.swing.*;
import java.awt.event.*;

class WindowExam1st extends JFrame implements WindowListener {
    public WindowExam1st() {
        setTitle("Window Listener first example");
        setSize(400, 500);
        setVisible(true);
        addWindowListener(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // it holds the window to be closed

    }

    public void windowClosing(WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to exit ?");
        if (choice == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        new WindowExam1st();
    }
}