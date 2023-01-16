import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {

    public static void main(String[] args) {
        
        try{
            // ServerSocket should be unique, it can not be made new 
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("server running at 5000");
            //The accept() call is used by a server to accept a connection request from a client
            Socket socket = ss.accept();
            System.out.println("client accepted");
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            String msg = dis.readUTF();
            System.out.println("Client says:- "+msg);
            dis.close();
            socket.close();
            ss.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
