
import java.awt.*;

class First {

    public First() {
        Frame f = new Frame("SE-III");
        Button b = new Button("click");
        TextField t = new TextField();
        f.setSize(400, 500);
        t.setBounds(100, 100, 200, 50);
        b.setBounds(110, 250, 170, 50);
        f.add(t);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new First();
    }

}