package target150.more140andLess150;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCachePractice2 {
    static int capacity = 5;
    static Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>(capacity,.75f,true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return map.size() > capacity;
        }
    };

    public static void main(String [] args) {
        map.put(10,100);
        map.put(20,200);
        map.put(30,300);
        map.put(40,400);
        map.put(50,500);
        map.get(20);
        map.put(60,600);
        System.out.println(map);
    }
}
