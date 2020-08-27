package target150.more140andLess150;

import java.util.*;

public class LRUCachePractice {

    public int capacity;
    LinkedHashMap<Integer, Integer> map = null;

    public LRUCachePractice(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap(capacity, .75f, true) {

            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return map.size() > capacity;
            }

        };
    }

    public int get(int key) {
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

}