import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadFromOneAndWriteInAnother2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("isha.txt");
        FileWriter fw = new FileWriter("javafirst¬.txt");
        int data; // to stor the ASCII value
        while ((data = fr.read()) != -1) {
            fw.write(data);
        }
        fr.close();
        fw.close();
    }

}
