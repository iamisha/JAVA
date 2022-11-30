import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.EventObject;

public class EventObject1st extends Frame implements ActionListener {
    TextField t;
    Label l;
    Button b1;
    Button b2;

    public EventObject1st() {
        setTitle("BESE-III");
        t = new TextField();
        b1 = new Button("click1st");
        b2 = new Button("click2nd");
        setLayout(null);
        setVisible(true);
        setSize(400, 500);
        t.setBounds(100, 100, 220, 50);
        b1.setBounds(150, 160, 100, 50);
        b2.setBounds(150, 220, 100, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(t);
        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if (source == b1) {

            t.setText("you have clicked the 1st button");
        }
        if (source == b2) {
            t.setText("you have clicked the 2nd button");
        }
    }

    public static void main(String[] args) {
        new EventObject1st();
    }
}
