package day09.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReviceDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(9848);
        byte [] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        while(true){
            ds.receive(dp);

            InetAddress address = dp.getAddress();
            String hostName = address.getHostName();
            String hostAddress = address.getHostAddress();

            byte[] data = dp.getData();
            int length = data.length;
            String str = new String(data,0,length);
            System.out.println(hostName+":"+hostAddress+"-------->"+str);
            if (str.equals("886")){
                break;
            }
        }

        ds.close();
    }
}
