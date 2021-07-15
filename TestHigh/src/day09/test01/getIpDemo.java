package day09.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class getIpDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName("LAPTOP-HLDIFC5H");
        System.out.println(Arrays.toString(allByName));
    }
}
