package target150.more140andLess150;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheImpl {
    public static void main(String [] args) {
        LRUCachePractice lruCache = new LRUCachePractice(5);

        lruCache.put(1,5);
        lruCache.put(2,10);
        lruCache.put(3,15);
        lruCache.put(4,20);
        lruCache.put(5,25);
        int key = lruCache.get(1);
        lruCache.put(6,30);
        lruCache.put(7,35);
        System.out.println(lruCache.map);

    }
}

class LRUCache {

    private int capacity;
    LinkedHashMap<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap(capacity,.75f,true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return map.size() > capacity;
            }
        };

    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key,value);
    }
}