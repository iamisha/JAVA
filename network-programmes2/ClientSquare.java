
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.DataInputStream;

class ClientSquare{
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 5001);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer you want square of:- ");
            int value = sc.nextInt();
            dos.writeInt(value);

            // to read the message sent by the server
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            double square = dis.readDouble();

            System.out.println("Server Sends:- "+square);

            // closing
            dis.close();
            dos.close();
            socket.close();
            sc.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}