import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class PU2nd extends JFrame {
    JTextField t;
    JButton b;

    PU2nd() {

        setTitle("Swing");
        t = new JTextField();
        b = new JButton("click");
        setSize(400, 400);
        setVisible(true);
        setLayout(null);
        t.setBounds(100, 100, 170, 40);
        b.setBounds(135, 200, 85, 40);
        add(t);
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText());
                Font font = new Font("Aerial", Font.BOLD, 20);
                t.setFont(font);
                // setBackground(Color.BLUE); it doesn't chage the color
                getContentPane().setBackground(Color.MAGENTA);
                // The getContentPane() method retrieves the content pane layer so that you can
                // add an object to it.
            }
        });

    }

    public static void main(String[] args) {
        new PU2nd();
    }
}