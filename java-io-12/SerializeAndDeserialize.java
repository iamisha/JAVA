
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void show() {
        System.out.println(this.name + " " + this.roll);
    }

    public static void serialize(Student s) throws IOException {

        FileOutputStream fos = new FileOutputStream("file.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();

    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("file.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student) ois.readObject();
        s.show();
        ois.close();
        fis.close();

    }

}

public class SerializeAndDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student(10, "Isha Hitang");
        Student.serialize(s);
        Student.deserialize();

    }
}
