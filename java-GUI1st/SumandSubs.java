import java.awt.*;
import javax.swing.*;
//import javax.swing.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SumandSubs extends Frame implements ActionListener {
    JTextField t1, t2, t3;
    JButton b1, b2;

    public SumandSubs() {
        setTitle("sum and substraction");
        setVisible(true);
        setLayout(null);
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton();
        b2 = new JButton();
        setSize(400, 400);
        t3.setEditable(false);
        b1 = new JButton("+");
        b2 = new JButton("-");
        t1.setBounds(100, 150, 170, 40);
        t2.setBounds(100, 180, 170, 40);
        t3.setBounds(100, 210, 170, 40);
        b1.setBounds(100, 250, 50, 50);
        b2.setBounds(210, 250, 50, 50);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if (e.getSource() == b1) {
            int ans = a + b;
            t3.setText(" " + ans);
        } else {
            int ans = a - b;
            t3.setText(" " + ans);
        }

    }

    public static void main(String[] args) {
        new SumandSubs();
    }
}