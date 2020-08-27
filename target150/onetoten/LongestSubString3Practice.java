package target150.onetoten;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString3Practice {

    public static void main(String [] args) {
        String word = "helloabcd";
        LongestSubString3Practice practice = new LongestSubString3Practice();
        int max = practice.maxLengthSubString(word);
        System.out.println("Max length sub string --> "+max);
    }

    int maxLengthSubString(String word) {
        Set<Character> set = new LinkedHashSet<>();
        Set<Character> subSet = new LinkedHashSet<>();

        int i = 0; int j = 0;
        int maxLenghtSubString = Integer.MIN_VALUE;

        while(j < word.length()) {
            if(!set.contains(word.charAt(j))) {
                set.add(word.charAt(j++));
                if(maxLenghtSubString < set.size()) {
                    maxLenghtSubString = set.size();
                    subSet = set;
                }
            } else {
                set.remove(word.charAt(i++));
            }
        }
        System.out.println(subSet);
        return maxLenghtSubString;
    }

}
