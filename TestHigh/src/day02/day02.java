package day02;

public class day02 {
    public static void main(String[] args) throws  ArithmeticException{

    }


    
    public static void function() throws ArithmeticException{
        System.out.println("上课");
            System.out.println(10 / 0);
        System.out.println("放学");

    }

    /**
     * 1.6后try-catch新特性
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
