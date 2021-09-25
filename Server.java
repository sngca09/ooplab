import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String ...a) throws Exception {
        System.out.println("Server started");
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("Waiting...");
        Socket s = ss.accept();
        System.out.println("Connected");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println(str);
    }
}