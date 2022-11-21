import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ReadFromOneAndWriteInAnother {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("java.txt");
        FileOutputStream fos = new FileOutputStream("isha.txt");
        int data; // to stor the ASCII value
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
