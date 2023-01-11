import javax.swing.*;

public class MessageDialogExam {
    JFrame f;

    public MessageDialogExam(){
        f = new JFrame();
      //  JOptionPane.showMessageDialog(f, "hello, i'm message dialog box");
        JOptionPane.showMessageDialog(f, "this is warning message", "message-dialog", JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String [] args){
        new MessageDialogExam();
    }
    
}
