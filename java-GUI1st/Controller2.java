import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller2 extends JFrame {

    JTextField t;
    JButton b;

    public Controller2() {
        setTitle("change the backgrouned of frame");
        t = new JTextField("me here");
        t.setBounds(100, 150, 170, 50);
        add(t);

        b = new JButton("click");
        b.setBounds(135, 200, 100, 40);
        add(b);

        setSize(400, 500);
        setLayout(null);
        Test t = new Test(this);// getting the address of it's own class
        b.addActionListener(t); // adding the object of the class Test
        setVisible(true);

    }

    public static void main(String[] args) {
        new Controller2();
    }

}

class Test implements ActionListener {
    Controller2 con; // getting all the properties of the class Controller2 creating it's object con.

    public Test(Controller2 con) {
        this.con = con; // passing the arguments of the class Test in class Controller2 class
    }

    public void actionPerformed(ActionEvent e) {
        con.b.setBackground(Color.CYAN);
        con.getContentPane().setBackground(Color.YELLOW); // it works in both awt and swing.
    }
}
