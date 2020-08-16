package com.reachingskies.geeksandgeeks.strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String [] args) {
        String str1 = "hello";
        String str2 = "hello";
        boolean isAnagram = isAnagramOptimal(str1,str2);
        System.out.println(str1+" and "+str2+" are anagrams : "+isAnagram);
    }

    // Optimal solution
    // Input : str1 = hello, str2 = hello
    // Output : true
    // Logic : Iterate str1, str2 chars and increment char frequencies for str1
    //         decrement char frequencies for str2.
    //           Check if any char frequency has more than zero.
    // Time : O(n)

    static boolean isAnagramOptimal(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        int [] count = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0)
                return false;
        }
        return true;
    }

    // Bruteforce -> Sorting the string characters and comparing both strings
    // Time : O(n * logn)

    static boolean isAnagram(String str1, String str2) {
        if(str1 == null || str2 == null || (str1.length() != str2.length()))
            return false;
        char [] chars1 = str1.toCharArray();
        Arrays.sort(chars1);
        char [] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
        if(Arrays.toString(chars1).equals(Arrays.toString(chars2))) {
            return true;
        }
        return false;
    }
}
