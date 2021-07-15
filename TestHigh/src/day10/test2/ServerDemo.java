package day10.test2;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8989);
        Socket accept = ss.accept();


    }
}
