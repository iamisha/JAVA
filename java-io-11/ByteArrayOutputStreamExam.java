
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("htng.txt");
        FileOutputStream fos2 = new FileOutputStream("htng2.txt");
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        b.write(65); // write () writes data to the output stream
        b.write(66); // write () writes data to the output stream
        b.write(69); // write () writes data to the output stream
        b.write('i'); // write () writes data to the output stream
        b.write('s'); // write () writes data to the output stream
        b.write('h'); // write () writes data to the output stream
        b.write('a'); // write () writes data to the output stream
        b.writeTo(fos); // writeTo () method writes the entire data of the current OutputStream to the
                        // specified OutputStream
        b.writeTo(fos2);
        b.flush(); // it flushes the temp-buffer
        b.close();

    }

}
