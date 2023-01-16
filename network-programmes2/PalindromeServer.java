import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
public class PalindromeServer {
    public static void main(String[] args) {
        
        try{

            ServerSocket ss = new ServerSocket(5004);
            System.out.println("Server is running at 5004");
            Socket socket = ss.accept();
            System.out.println("client accepted");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String str = dis.readUTF();
            String rev = "";

            // loop
            for(int i=str.length()-1;i>=0;i--){
                rev = rev + str.charAt(i);
            }
            System.out.print(rev);
            // to write the data in client side
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            if(str.equals(rev)){
                dos.writeUTF("PALINDROME");
            }else{
                dos.writeUTF("NOT A PALINDROME");
            }
            dos.close();
            dis.close();
            socket.close();
            ss.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
