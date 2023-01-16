import java.io.DataInputStream;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.IOException;
public class Client {

    public static void main(String[] args) {
        
        try{
            Socket socket = new Socket("localhost", 5000);
            String message = "hey !, accept my request Server";

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF(message);
            dos.close();
            socket.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
