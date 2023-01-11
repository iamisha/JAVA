import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

class AreaofCircle extends JFrame implements ActionListener{
    JTextField tf;
    JLabel lbl;
    JButton btn;
   public  AreaofCircle(){
       // f = new JFrame("frame");
        setSize(400, 400);
        tf = new JTextField();
        tf.setBounds(100, 50, 100, 60);
        add(tf);
        tf.setBackground(Color.BLACK);
        lbl = new JLabel("i'm here");
        lbl.setBounds(130, 100, 100, 60);
        add(lbl);
        btn = new JButton("click");
        btn.setBounds(200, 300, 100, 60);
        add(btn);

        btn.addActionListener(this);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        Float radius = Float.parseFloat(tf.getText());
        float area = (float)3.14 * radius * radius;

        lbl.setText(String.valueOf(area));

    }
    public static void main(String[] args) {
        new AreaofCircle();
    }
}