package com.reachingskies.geeksandgeeks.strings;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String [] args) {
        String str = "welcome to hello world";
        char [] chars = ReverseWordsInString.reverseWords(str.toCharArray());
        System.out.println("Before reverse --> "+str);
        System.out.println("After reverse --> "+ new String(chars));
    }

    // Input : "hello world"
    // Output : "world hello"
    // Time : O(n)
    // Space : O(n) to store chars in char array.
    // Logic : Revers each word when char is ' ' until end of string.
    //       : Revers whole char array.
    static char [] reverseWords(char [] chars) {
        if(chars == null || chars.length == 0)
            return chars;
        int start = 0;
        // Revers each word when char is ' '
        for(int end = 0; end < chars.length; end++) {
            if(chars[end] == ' ') {
                reverse(chars,start,end-1);
                start = end+1;
            }
        }
        //last word to reverse.
        reverse(chars,start,chars.length-1);
        //Reverse whole string.
        reverse(chars,0,chars.length-1);
        return chars;
    }

    // Reverse method.
    static void reverse(char [] chars,int start, int end) {
        while(start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
