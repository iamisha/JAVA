
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class FormS extends JFrame implements ActionListener {
    JMenu menu;
    JMenuBar bar;
    JMenuItem s, copy, cut, paste, exit;
    JTextArea a;

    public FormS() {
        setTitle("Menu-Second");
        setSize(400, 500);
        bar = new JMenuBar();
        setJMenuBar(bar);
        menu = new JMenu("menu");
        bar.add(menu);
        s = new JMenuItem("select all");
        menu.add(s);
        copy = new JMenuItem("copy");
        menu.add(copy);
        cut = new JMenuItem("cut");
        menu.add(cut);
        paste = new JMenuItem("paste");
        menu.add(paste);
        menu.addSeparator();
        exit = new JMenuItem("exit");
        menu.add(exit);
        a = new JTextArea();
        add(a);
        a.setBounds(200, 300, 170, 50);
        setLayout(null);
        setVisible(true);
        s.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == s) {
            a.selectAll();
        } else if (source == copy) {
            a.copy();
        } else if (source == cut) {
            a.cut();
        } else if (source == paste) {
            a.paste();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new FormS();
    }
}