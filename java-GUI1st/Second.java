import java.awt.*;

public class Second extends Frame {

    public Second() {
        setTitle("SE-III");
        TextField t = new TextField();
        Button b = new Button("click");
        setSize(400, 500);
        b.setBounds(110, 250, 170, 50);
        t.setBounds(100, 100, 200, 50);
        add(t);
        add(b);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Second();
    }

}
