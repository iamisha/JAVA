
import java.io.IOException;
import java.io.FileWriter;

class FileWriterExam1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("myfle.txt", true);
        String str = "\n\ni love you too ";
        fw.write(str); // no need to convert it into the byte
        fw.close();
    }
}