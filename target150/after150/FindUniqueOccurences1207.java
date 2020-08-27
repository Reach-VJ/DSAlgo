package target150.after150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUniqueOccurences1207 {
    public static void main(String [] args) {
        int [] arrayElements = {1,2,2,1,1,3};
        FindUniqueOccurences1207 unique = new FindUniqueOccurences1207();
        System.out.println(unique.uniqueOccurrences(arrayElements));
    }

    public boolean uniqueOccurrences(int[] arr) {

        //Add elements to Map and their occurrences
        //Get the Key values and find unique value.
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i : arr) {
            if(map.containsKey(arr[i]))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }

        for(int i : map.values()) {
            if(i == 1) {

            }
        }





        return false;

    }
}
