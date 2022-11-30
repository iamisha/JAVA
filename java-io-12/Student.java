import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("detail.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        String p;
        do {
            System.out.println("Enter name:- ");
            String name = sc.next();
            System.out.println("Enter Roll no:- ");
            int roll = sc.nextInt();
            System.out.println("Enter the address:- ");
            String addr = sc.next();
            System.out.println("Enter the faculty:- ");
            String fac = sc.next();

            dos.writeUTF(name);
            dos.writeInt(roll);
            dos.writeUTF(addr);
            dos.writeUTF(fac);

            System.out.println("press n to exit, press any key to continue:- ");
        } while (!(p = sc.next()).toLowerCase().startsWith("n"));
        dos.close();
        fos.close();
    }
}
