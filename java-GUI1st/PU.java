import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

public class PU extends Frame implements ActionListener {

    TextField t;
    Button b;
    Label l;

    PU() {
        setTitle("POkhara-University");
        t = new TextField();
        b = new Button("click");
        l = new Label();
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
        setBackground(Color.CYAN);

    }

    public static void main(String[] args) {
        new PU();
    }

}
