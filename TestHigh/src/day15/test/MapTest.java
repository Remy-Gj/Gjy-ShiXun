package day15.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();


        map.put("我草","尼玛");
        map.put("我杀","尼玛");
        map.put("傻逼","玩意");


        boolean a = map.containsKey("傻逼");
        System.out.println(a);
        System.out.println("==============================");
        boolean b = map.containsValue("尼玛");
        System.out.println(b);
        System.out.println("==============================");
        boolean empty = map.isEmpty();
        System.out.println(empty);
        System.out.println("==============================");
        int size = map.size();
        System.out.println(size);
        System.out.println("==============================");


        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> map1 : entries){
            String key = map1.getKey();
            String value = map1.getValue();
            System.out.println(key+ "--->" + value);
        }
    }
}
