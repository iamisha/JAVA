
/*
import javax.swing.*;
import java.awt.event.*;
*/
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class JPopupMenuExam implements MouseListener, ActionListener {
    JFrame f;
    JPopupMenu pm;
    JMenuItem s, copy, cut, paste, exit;
    JTextArea ta;

    public JPopupMenuExam() {
        f = new JFrame("dynamic popup menu");
        f.setSize(600, 600);

        pm = new JPopupMenu();
        f.add(pm);

        s = new JMenuItem("select All");
        pm.add(s);

        copy = new JMenuItem("copy");
        pm.add(copy);

        cut = new JMenuItem("cut");
        pm.add(cut);

        paste = new JMenuItem("paste");
        pm.add(paste);
        pm.addSeparator();

        exit = new JMenuItem("exit");
        pm.add(exit);

        ta = new JTextArea("write sth here...");
        ta.setBounds(300, 350, 200, 150);
        f.add(ta);
        ta.setText(ta.getText());

        f.addMouseListener(this);
        s.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        pm.show(f, e.getX(), e.getY());
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == s)
            ta.selectAll();
        else if (source == copy)
            ta.copy();
        else if (source == cut)
            ta.cut();
        else if (source == paste)
            ta.paste();
        else
            System.exit(0);
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        new JPopupMenuExam();
    }

}