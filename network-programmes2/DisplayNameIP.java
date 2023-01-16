import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
public class DisplayNameIP {

    public static void main(String[] args) {
        
        try{

            // getNetworkInterfaces() returns a list of all interfaces
            // present in the system.
            Enumeration<NetworkInterface> infaces = NetworkInterface.getNetworkInterfaces();
            

            // for loop

            System.out.println("Informations about present network intefaces\n");
            for(NetworkInterface iface : Collections.list(infaces)){

                System.out.println("Display Name:- "+iface.getDisplayName());
                System.out.println("Name:- "+iface.getName());
                System.out.println("----------------------");
                // Interface addresses of the network interface
               
                // getInetAddresses() method returns list of all
                // addresses currently bound to this interface
                Enumeration <InetAddress> inet = iface.getInetAddresses();

                System.out.println("\tInetAddresses associated with this interface: ");
                for(InetAddress ip : Collections.list(inet)){
                    System.out.println("Address:- "+ip.getHostAddress());
                }
            }
        }catch(SocketException e){
            System.out.println(e.getMessage());
        }
    }
    
}

