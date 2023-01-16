
// reads the content of the URL.

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;

class URLConnectionExam{
    public static void main(String[] args) {
        
    try{
        URL url = new URL("https://www.google.com/");
        URLConnection con = url.openConnection();

        // InputStream reads the string of the specified URL
        InputStream is = con.getInputStream();

        int data;

        while((data = is.read()) != -1){
            System.out.print((char)data);
        }
        is.close();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
}
}