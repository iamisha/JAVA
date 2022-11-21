import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * class FileInputStreamExample {
 * public static void main(String[] args) {
 * try {
 * FileInputStream fis = new FileInputStream("isha.txt");
 * int data; // to store the ASCII dat
 * while ((data = fis.read()) != -1) { // read the file till the end of file
 * System.out.print((char) data); // converts the ascii data into char.
 * 
 * }
 * 
 * } catch (IOException e) {
 * System.out.println(e.getMessage());
 * }
 * }
 * }
 */

/*
 * second method throwing the Exception
 * class FileInputStreamExample {
 * public static void main(String[] args) throws IOException {
 * try {
 * FileInputStream fis = new FileInputStream("file.txt");
 * int d;
 * while ((d = fis.read()) != -1) {
 * System.out.print((char) d);
 * }
 * } catch (FileNotFoundException e) {
 * System.out.println("creat a file at first");
 * }
 * }
 * }
 */

/*
 * class FileInputStreamExample {
 * public static void main(String[] args) throws IOException {
 * File file = new File("myfle.txt");
 * FileInputStream fis = new FileInputStream(file);
 * int d;
 * while ((d = fis.read()) != -1) {
 * System.out.print((char) d);
 * }
 * }
 * }
 * 
 */

class FileInputStreamExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:- ");
        String str = sc.nextLine();
        try {
            FileInputStream fis = new FileInputStream("book.txt");
            byte[] b = str.getBytes();
            fis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}