import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressE {

    public static void main(String[] args) {
        
        try{

            byte [] b = {127,0,0,1};

            InetAddress ip = InetAddress.getByAddress(b);

            /* 
             We use isloopbackAddress() method to check if our NIC(Netwrok Interface Card is working or not)
             */
            System.out.println("Is it loopbackaddress ?"+ " " +ip.isLoopbackAddress());

            System.out.println("Loopback Address:- "+InetAddress.getLoopbackAddress());

            System.out.println("Is it multicastAddress ?"+ " "+ip.isMulticastAddress());

            System.out.println("Is it a globalMultiCastAddress ?"+ " " + ip.isMCGlobal());

        }catch(UnknownHostException e){
            System.out.println(e.getMessage());
        }
    }
    
}
