import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;

class Copy2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("itsme.gif");
            FileOutputStream fos = new FileOutputStream("copied.gif");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}