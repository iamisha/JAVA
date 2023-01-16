

import java.net.*;
import java.io.*;
import java.util.Scanner;

class CheckPalindromeClient{
    public static void main(String [] args)
    {
        try{
        Socket soc = new Socket("localhost",5003);

        DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string to check for palindrome or not: ");
        String str=sc.next();
        dos.writeUTF(str);

        DataInputStream dis=new DataInputStream(soc.getInputStream());
        String msg=dis.readUTF();
        System.out.println("Server message: "+msg);

        dis.close();
        dos.close();
        soc.close();
        sc.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}