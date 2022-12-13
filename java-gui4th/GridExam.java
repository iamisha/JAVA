import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

class GridExam extends JFrame {
    JButton[] btns;

    public GridExam() {
        btns = new JButton[4];
        for (int i = 0; i <= 3; i++) {
            btns[i] = new JButton("b" + (i + 1));
            add(btns[i]);
        }
        // setLayout(new GridLayout());
        setLayout(new GridLayout(2, 2));
        // setLayout(new GridLayout(3, 3, 20, 25));
        setSize(400, 500);
        // pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridExam();
    }
}