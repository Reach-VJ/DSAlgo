package com.reachingskies.geeksandgeeks.strings;

public class LeftMostRepeatingChar {

    public static void main(String [] args) {
        String str = "hello";
        int index = LeftMostRepeatingChar.leftMostRepeatingChar(str);

        System.out.println("Left most repeated character --> "+ str.charAt(index));
    }

    // Input : "geeksforgeeks" g is the first character appears more than 1 time.
    // Output : 0 (g) index of g in str.
    // Time : O(n)
    // Space : O(n) --> to save frequencies of chars.
    static int leftMostRepeatingChar(String str) {

        if(str == null || str.length() == 0)
            return -1;
        int [] charCount = new int[26];
        //Store frequencies of chars in charCount array.
        for(int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)-'a']++;
        }

        //Check first char which appears more than 1 time and return index or -1
        for(int i = 0; i < str.length(); i++) {
            if(charCount[str.charAt(i)-'a'] > 1) {
               return i;
            }
        }
        return -1;
    }
}
