package com.reachingskies.geeksandgeeks.strings;

public class PatternMatching {

    public static void main(String [] args) {
        String str = "ABCEABCD";
        String pattern = "ABCD";
        PatternMatching.patternMatchIndex(str,pattern);
    }

    static void patternMatchIndex(String str,String pattern) {
        for(int i = 0; i <= str.length()-pattern.length();) {
            int j;
            for(j = 0; j < pattern.length(); j++) {
                if(pattern.charAt(j) != str.charAt(i+j))
                    break;
            }
            if(j == pattern.length())
                System.out.println(i+" ");
            if(j == 0)
                i++;
            else
                i = i+j;

        }

    }
}
