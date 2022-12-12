
/*
 * import java.io.FileOutputStream;
 * import java.io.IOException;
 * 
 * public class FileOutputStreamExam {
 * public static void main(String[] args) throws IOException {
 * FileOutputStream fos = new FileOutputStream("java.txt", true);
 * 
 * byte[] b = { 'c', 'd' };
 * fos.write(b);
 * fos.close();
 * }
 * 
 * }
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class FileOutputStreamExam {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        FileOutputStream fos = new FileOutputStream("java.txt", true);
        byte[] b = str.getBytes(); // getBytes() method converts a string to an array
        fos.write(b);
        fos.close();
    }
}
