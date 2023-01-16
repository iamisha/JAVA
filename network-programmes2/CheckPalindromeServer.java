import java.net.*;
import java.io.*;

class CheckPalindromeServer{
    public static void main(String [] args){

        try{
        ServerSocket ss= new ServerSocket(5003);
        System.out.println("Server running at 5003");
        Socket soc = ss.accept();

        DataInputStream dis=new DataInputStream(soc.getInputStream());
        String input=dis.readUTF();
        String rev="";
        for(int i = input.length()-1;i>=0;i--){
            rev = rev + input.charAt(i);
        }
      
        DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
        if(input.equals(rev)){
            dos.writeUTF("Palindrome");
        }
        else{
            dos.writeUTF("Not a palindrome");
        }
        dos.close();
        dis.close();
        soc.close();
        ss.close();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
        
    }
}