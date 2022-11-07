import java.util.Scanner;

public class IntDetec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any thing to check whether it is int or not: ");
        System.out.println(sc.hasNextInt());
    }
}
