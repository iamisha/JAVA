import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamExam2 {

    public static void main(String[] args) throws IOException {
        // creates an output stream with default size
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        String str = "isha hitang";
        b.write(str.getBytes()); // converting the given strings to the array of bytes as wll as writing the data
                                 // to output stream.
        // returns an array of bytes
        // byte[] arrayByte = b.toByteArray();
        // for (int i = 0; i <= arrayByte.length; i++) {
        // System.out.print((char) arrayByte[i]);
        // }
        // Returns a string
        String str2 = b.toString();
        System.out.println(str2);
        b.flush();
        b.close();
    }
}