package day02;

public class day02 {
    public static void main(String[] args) throws  ArithmeticException{

    }


    
    public static void function() throws ArithmeticException{
        System.out.println("�Ͽ�");
            System.out.println(10 / 0);
        System.out.println("��ѧ");

    }

    /**
     * 1.6��try-catch������
     */
    public static void method4(){
        try{
            Object o = null;
            System.out.println(o.toString());
            System.out.println(10/0);
            int[] arr = new int[3];

        }catch (ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException e){
            e.printStackTrace();
        }
    }


}
