import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionProgram {
    public static void main(String[] args) {
        readFile("myFile.txt");
    }

    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("hey that file doesn't exit");
        }
    }
}