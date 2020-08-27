package com.reachingskies.geeksandgeeks.practice.strings;

import java.util.*;


public class LongestSubStringWithOutRepeatingChars {

    public static void main(String[] args) {
        String str = "helloworld";
        int maxSubString = LongestSubStringWithOutRepeatingChars.logngestSubString(str);
        System.out.println("Max Sub String length : " + maxSubString);
    }

    static int logngestSubString(String str) {
        int max = 0;

        Set<Character> set = new LinkedHashSet<>();
        Set<Character> subSet = new LinkedHashSet<>();
        int i = 0; int j = 0;

        while(i < str.length()) {
            if(!set.contains(str.charAt(i))) {
                set.add(str.charAt(i++));
                if(set.size() > max) {
                    max = set.size();
                    subSet = set;
                }
            } else {
                set.remove(str.charAt(j++));
            }
        }
        System.out.println(subSet);
        return max;

    }
}
