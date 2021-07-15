package day09.test02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            DatagramPacket dp = new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("192.168.80.200"),10087);
            ds.send(dp);
            if (str.equals("886")){
                break;
            }
        }

        ds.close();
    }
}
