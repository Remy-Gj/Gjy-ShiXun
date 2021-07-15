package day14.test1;

public class MyTrace {
    public static void main(String[] args) {
        LinkedTest trace = new LinkedTest();
        trace.setlist("卧槽你妈的");
        trace.setlist("你妈死了");
        trace.setlist("WDNMD");
        while (trace.isEmpity()){
            String getlist = trace.getlist();
            System.out.println(getlist);
        }
    }
}
