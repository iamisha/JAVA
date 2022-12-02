import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PU1st extends JFrame implements ActionListener {
    JTextField t;
    JButton b;

    PU1st() {
        setTitle("POkhara-University");
        t = new JTextField();
        b = new JButton("click");
        setSize(400, 400);
        setVisible(true);
        setLayout(null);
        t.setBounds(100, 150, 170, 50);
        b.setBounds(130, 230, 100, 50);
        add(t);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        t.setText(t.getText());
        Font font = new Font("Aerial", Font.BOLD, 20);
        t.setFont(font);
        setBackground(Color.BLUE);

    }

    public static void main(String[] args) {
        new PU1st();
    }

}
