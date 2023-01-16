import java.net.Socket;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.DataInputStream;

public class PalindromeClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 5004);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string to pass in server to check  if the string is 'palindrome' or not:- ");
            String str = sc.nextLine();

            dos.writeUTF(str);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String messagerFromServer = dis.readUTF();
            System.out.println("Server sends:- "+messagerFromServer);


            // closing
            dis.close();
            dos.close();
            sc.close();
            socket.close();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
