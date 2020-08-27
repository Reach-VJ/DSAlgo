package com.reachingskies.geeksandgeeks.strings;

public class Palindrome {

    public static void main(String [] args) {
        String str = "viv";
        boolean isPalindrome = Palindrome.isPalindrome(str);
        System.out.println("Is "+isPalindrome+" palindrome "+isPalindrome);
    }

    // Time : O(n)
    static boolean isPalindrome(String str) {
        int start = 0, end = str.length()-1;

        while(start <= end) {
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
