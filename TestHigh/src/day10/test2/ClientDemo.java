package day10.test2;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws  Exception{
        Socket socket = new Socket("192.168.80.200",10090);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader br = new BufferedReader(new FileReader(""));

        String data = null;
        while ((br.readLine())!=null){
            bw.write(data);
            bw.newLine();
            bw.flush();
        }
        socket.shutdownOutput();

        String s = br1.readLine();
        System.out.println(s);

        socket.close();
        br.close();
    }
}
