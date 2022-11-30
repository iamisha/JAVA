import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Student2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("detail.dat");
        DataInputStream dis = new DataInputStream(fis);

        while ((dis.available()) > 0) {
            String name = dis.readUTF();
            int roll = dis.readInt();
            String add = dis.readUTF();
            String fac = dis.readUTF();
            if (fac.toLowerCase().equals("software"))
                System.out.println("Name:- " + name + " " + "Roll no:- " + roll + " " + "Address:- " + add + " "
                        + "Faculty:- " + fac);
        }
        dis.close();
        fis.close();

    }

}
