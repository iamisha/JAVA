import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutExam extends JFrame {
    public BorderLayoutExam() {
        setLayout(new BorderLayout(20, 25));
        JButton btn_north = new JButton("north");
        JButton btn_south = new JButton("south");
        JButton btn_east = new JButton("east");
        JButton btn_west = new JButton("west");
        JButton btn_center = new JButton("center");
        add(btn_north, BorderLayout.NORTH);
        // add(btn_north, "North");
        add(btn_south, BorderLayout.SOUTH);
        add(btn_east, BorderLayout.EAST);
        add(btn_west, BorderLayout.WEST);
        add(btn_center, BorderLayout.CENTER);
        pack(); // resizes the frame according to the contens that are available...
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new BorderLayoutExam();
    }

}
