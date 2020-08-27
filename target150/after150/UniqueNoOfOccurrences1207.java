package target150.after150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNoOfOccurrences1207 {

    public static void main(String[] args) {
        int[] elements = {-3,0,1,-3,1,1,1,-3,10,0};
        UniqueNoOfOccurrences1207 unique = new UniqueNoOfOccurrences1207();
        System.out.println("Unique Number of Occurences :" + unique.uniqueOccurrences(elements));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : arr) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet) {
            if(entry.getValue() == 1)
                System.out.println(entry.getKey());
        }
        return set.size() == map.size();
    }
}
