import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class ActionListener2 extends Frame implements ActionListener {
    TextField t;
    Label l;

    public ActionListener2() {
        setTitle("Odd-Even");
        t = new TextField();
        Button b = new Button("click");
        l = new Label();
        setSize(400, 500);
        t.setBounds(100, 100, 200, 50);
        b.setBounds(110, 250, 170, 50);
        l.setBounds(110, 180, 180, 50);
        add(l);
        add(b);
        add(t);
        b.addActionListener(this);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t.getText());
        if (num % 2 == 0) {
            l.setText("you've entered an even num");
        } else {
            l.setText("you've entered an odd num");
        }
    }

    public static void main(String[] args) {
        new ActionListener2();
    }
}