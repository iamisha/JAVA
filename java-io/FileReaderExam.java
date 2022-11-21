import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myfle.txt");
        int data;
        while ((data = fr.read()) != -1) { // read converts the characters into the ascii values and data stores those
                                           // values
            System.out.print((char) data);// ascii values are converted into the characters.
        }
        fr.close();
    }

}
