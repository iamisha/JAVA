import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

class URLMethod{
    public static void main(String [] args){
        try{
       
            URL url = new URL("https://www.github.com:3000/iamisha?tab=repositories#git");
            System.out.println("Protocol:- " + url.getProtocol());
            System.out.println("Domain/Host:- " + url.getHost());
            System.out.println("Authority:- "+url.getAuthority());
            System.out.println("Port Number:- "+url.getPort());
            System.out.println("Default Port Number:- "+url.getDefaultPort());
            System.out.println("Path:- "+url.getPath());
            System.out.println("File:- "+url.getFile());
            System.out.println("Query String :- "+url.getQuery());
            System.out.println("Anchor/Reference:- "+url.getRef());
            System.out.println("URI:-"+url.toURI());
            System.out.println("URL String:- "+url.toString());
       
    }catch(MalformedURLException e){
        System.out.println(e.getMessage());
    }catch(URISyntaxException e){
        System.out.println(e.getMessage());
    }
}
}
