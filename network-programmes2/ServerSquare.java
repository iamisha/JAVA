
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class ServerSquare{
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(5001);
            System.out.println("Server running at 5001");
            Socket socket = ss.accept();

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            // storing the value send by the client in inputValue
            int inputValue = dis.readInt();

            System.out.println("Client sends value:- "+inputValue);

            // to write the result in client 
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            double square = Math.pow(inputValue, 2);

            dos.writeDouble(square);

            dos.close();
            dis.close();
            socket.close();
            ss.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
