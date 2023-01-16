import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
    public static void main(String[] args) {
        
        try{
            
           InetAddress inet = InetAddress.getByName("www.ishahitang.com.np");
           System.out.println("Host Name:- "+inet.getHostName());
           System.out.println("IP Address:- "+inet.getHostAddress());
           
          // To check the address of localhost
          InetAddress add = InetAddress.getLocalHost();
          System.out.println("Local Host Name:- "+add.getHostName());
          System.out.println("LocalHost IP:- "+add.getHostAddress());
           
        }catch(UnknownHostException e){
            System.out.println("name not known");
        }
    }
    
}
