
//importing the class Scanner that helps to take the input from the user as per the requirements.
import java.util.Scanner;

public class GREET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name !");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", " + "have a good day !");
    }
}
