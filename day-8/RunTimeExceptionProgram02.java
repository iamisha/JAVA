import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTimeExceptionProgram02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter first num:-");
            int a = sc.nextInt();
            System.out.println("enter second num:-");
            int b = sc.nextInt();
            int c = (b / a);
        } catch (ArithmeticException e) {
            System.out.println("please give first valid num");
        } catch (InputMismatchException e) {
            System.out.println("please enter only integers ");
        } finally {
            System.out.println("program terminates");
        }
    }
}
