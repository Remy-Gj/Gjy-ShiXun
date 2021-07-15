package day04;

import java.io.*;

public class IOBufferedStream {
    public static void main(String[] args) throws IOException {
        test4();
    }

    public static void test() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
        String str = "������ţ��";
        bos.write(str.getBytes());
        bos.close();
    }

    public static void test1() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("�ҵ���!����ʦ.mp4"));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\�����ļ�\\�߼�\\day03\\��Դ\\��ս�ſ�֮��.mp4"));
        int len = -1;
        byte[] bytes = new byte[1024];
        while ((len= bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }

    public static void test2() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("WOcao.txt"),"UTF-8");
        osw.write("���,ɵ��");
        osw.close();
    }


    public static void test3() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("read.txt"),"UTF-8");
        int len = -1;
        char[] chars = new char[1024];
        while ((len = isr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        isr.close();
    }

    public static void test4() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("read.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("ews.txt"));
        int len = -1;
        char[] chars = new char[1024];
        while ((len=br.read(chars))!=-1){
            bw.write(chars,0,len);
        }
        bw.close();
        br.close();
    }
}
