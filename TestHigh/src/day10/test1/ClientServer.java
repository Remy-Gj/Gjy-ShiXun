package day10.test1;

import java.io.*;
import java.net.Socket;


public class ClientServer {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.80.200",10090);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        BufferedReader br1 = new BufferedReader(new InputStreamReader(inputStream));
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("lsp1.jpg"));
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = bi.read(bytes))!=-1) {
           bos.write(bytes,0,len);
        }
        socket.shutdownOutput();

        String s = br1.readLine();
        System.out.println(s);

        outputStream.close();
        socket.close();

    }
}
