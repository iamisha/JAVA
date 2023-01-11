import javax.swing.*;

public class ConfirmDialogExam {

    JFrame f;

    public ConfirmDialogExam(){
        f = new JFrame();
      //  JOptionPane.showConfirmDialog(f, "do you want to continue ?");
      JOptionPane.showConfirmDialog(f, "do you want to exit", "confirm-dialog", JOptionPane.OK_CANCEL_OPTION);

    }
    public static void main(String[] args) {
        new ConfirmDialogExam();
    }
    
}
