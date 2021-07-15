package day10.test1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket s = serverSocket.accept();
        InputStream isr = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = -1;
        while((len = isr.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        isr.close();
        serverSocket.close();
    }
}
