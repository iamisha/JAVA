import javax.swing.*;

class InputDialogExam{
    JFrame f;

    public InputDialogExam(){
        f = new JFrame();
        JOptionPane.showInputDialog(f, "enter your age");
    }
    public static void main(String[] args) {
        new InputDialogExam();
    }
}