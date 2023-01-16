import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
public class Header {

    public static void main(String [] args){

        try{
            URL url = new URL("https://www.ishahitang.com.np/");
            //casting to HttpURLConnection
            HttpURLConnection con = (HttpURLConnection)url.openConnection();

            // for loop

            Map<String, List<String>> headers = con.getHeaderFields();

            for(Map.Entry<String,List<String>> h : headers.entrySet()){
                System.out.println(h.getKey() + "\n" + h.getValue());
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
