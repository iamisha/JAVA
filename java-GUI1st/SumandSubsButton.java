import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SumandSubsButton extends Frame implements ActionListener {
    TextField t1;
    TextField t2;
    TextField t3;
    Button b1;
    Button b2;

    SumandSubsButton() {
        setTitle("Sum and Substract");
        setSize(400, 400);
        setVisible(true);
        setLayout(null);
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t3.setEditable(false);
        b1 = new Button("+");
        b2 = new Button("-");
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
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        Object source = e.getSource();

        if (source == b1) {
            int ans1 = num1 + num2;
            String res1 = String.valueOf(ans1);
            t3.setText("sum:- " + res1);
        }
        if (source == b2) {
            int ans1 = num1 - num2;
            String res1 = String.valueOf(ans1);
            t3.setText("substraction:- " + res1);
        }

    }

    public static void main(String[] args) {
        new SumandSubsButton();
    }
}
