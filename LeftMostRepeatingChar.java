package com.reachingskies.geeksandgeeks.strings;

public class LeftMostRepeatingChar {

    public static void main(String [] args) {
        String str = "heollo";
        int index = LeftMostRepeatingChar.leftMostRepeatingCharOptimal(str);

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

    // Input : "heollo" o is the first character appears more than 1 time.
    // Output : 2 (or o) index of o in str.
    // Time : O(n)
    // Space : O(n) --> to save frequencies of chars.
    static int leftMostRepeatingCharOptimal(String str) {

        if(str == null || str.length() == 0)
            return -1;
        int index = -1;
        boolean [] visited = new boolean[256];
        //Assign i to index if char appears second time.
        // Why iterating back to front --> to find left most repeated char.
        // It will print l if iterate front to back.
        for(int i = str.length()-1; i >= 0; i--) {
            if(visited[str.charAt(i)] == true)
                index = i;
            else
                visited[str.charAt(i)] = true;
        }
        return index;
    }
}
