import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class MyFlowLayout extends JFrame {
    JButton[] btns;

    public MyFlowLayout() {

        btns = new JButton[6];
        for (int i = 0; i <= 5; i++) {
            btns[i] = new JButton("b" + (i + 1));
            add(btns[i]);
        }
        setSize(400, 500);
        // setLayout(new FlowLayout());
        // setLayout(new FlowLayout(FlowLayout.LEFT));
        // setLayout(new FlowLayout(FlowLayout.RIGHT));
        // setLayout(new FlowLayout(FlowLayout.LEADING)); // same as FlowLayout.LEFT
        // setLayout(new FlowLayout(FlowLayout.TRAILING)); // same as FlowLayout.RIGHT
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MyFlowLayout();
    }
}
