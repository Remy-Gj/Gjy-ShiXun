package day07;

public class ThreadTicket extends Thread{
static  int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(getName() + "��������:" + (ticket--)+"��Ʊ");
            }
        }
    }
}
