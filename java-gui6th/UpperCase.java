import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
public class UpperCase extends JFrame{

    JTextField tf;
    JButton btn;


    UpperCase(){
        tf = new JTextField("type sth here...");
        btn = new JButton("click here");

        setSize(300, 400);
        tf.setBounds(70, 50, 150, 50);
        btn.setBounds(20, 100, 80, 50);

        add(tf);
        add(btn);

        btn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                String str = tf.getText();
                if(e.getSource() == btn){
                    tf.setText(str.toUpperCase());
                    tf.setBackground(Color.MAGENTA);
                }
            }

        });

        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public static void main(String[] args) {
        new UpperCase();
    }
    
}
