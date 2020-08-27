package target150.onetoten;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString3 {

    public static void main(String [] args) {
        String str = "helloworld";
        int length = new LongestSubString3().lengthOfLongestSubstring(str);
        System.out.println(length);
    }

    int lengthOfLongestSubstring(String s) {
        int maxLength = Integer.MIN_VALUE;
        int right = 0;
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        Set<Character> longSub = new LinkedHashSet<Character>();
        char [] array = s.toCharArray();

        while(right < array.length) {
            if(!map.containsKey(array[right])) {
                map.put(array[right],right);
                right++;
            }
            else {
                right = map.get(array[right]);
                right++;
                map.clear();
            }

            if(map.size() > maxLength) {
                maxLength = map.size();
                longSub = map.keySet();
            }
        }
        System.out.println(longSub);
        return maxLength;
    }

}
