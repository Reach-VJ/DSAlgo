package target150.after150;

import java.util.*;

public class TopKFrequentWords692 {

    public static void main(String[] args) {
        String[] array = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> list = TopKFrequentWords692.topKFrequent(array,4);
        System.out.println(list);
    }

    static public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        //Add words to map.
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 1) + 1);
        }

        //Get keys from map and create list
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        //Sort the keys/words. Compare based on frequency, if same compare lexicographical otherwise compare based on frequency.
        Collections.sort(keys, (k1, k2) -> map.get(k1).equals(map.get(k2)) ? k2.compareTo(k1) : map.get(k2) - map.get(k1));
        return keys.subList(0, k);
    }
}
