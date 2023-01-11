import javax.swing.*;
import java.awt.BorderLayout;
public class BorderLayoutExam{

    JFrame frame;
    
    BorderLayoutExam(){

        frame = new JFrame();
        frame.setSize(400, 400);
       
        JButton north = new JButton("NORTH");
        JButton south = new JButton("SOUTH");
        JButton west = new JButton("WEST");
        JButton east = new JButton("EAST");
        JButton center = new JButton("CENTER");

       // frame.setLayout(new BorderLayout(20, 30));
        
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(west, BorderLayout.WEST);
        frame.add(east, BorderLayout.EAST);
        frame.add(center, BorderLayout.CENTER);

        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new BorderLayoutExam();
    }

}
