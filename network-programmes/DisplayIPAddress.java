import java.net.InetAddress;
import java.net.UnknownHostException;
/* import java.net.*; */
public class DisplayIPAddress {

    public static void main(String[] args) {
        
        try{

            InetAddress [] local = InetAddress.getAllByName("www.youtube.com");

            // for loop 
            for(InetAddress add : local){
                System.out.println(add.getHostAddress());
            }
        }catch(UnknownHostException e){
            System.out.println(e.getMessage());
        }
    }
    
}
