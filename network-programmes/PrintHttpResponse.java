//program to print HttpResponse
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
public class PrintHttpResponse {
    public static void main(String[] args) {
        
    

    try{
        URL url = new URL("https://www.ishahitang.com.np/");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        System.out.println("Response code:- "+con.getResponseCode());
        System.out.println("Response Message:- "+con.getResponseMessage());
        System.out.println("Connection Timeout:- "+con.getConnectTimeout());
        System.out.println("Encoding:- "+con.getContentEncoding());
        System.out.println("Length of content:- "+con.getContentLength());
        System.out.println("Content type:- "+con.getContentType());
        System.out.println("Request Type:- "+con.getRequestMethod());
        System.out.println("Date:- "+con.getDate());
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
    
}
}