package com.reachingskies.geeksandgeeks.recursion;

public class CheckingPalindrome {

    public static void main(String [] args) {
        String word = "malayalam1";
        CheckingPalindrome palindrome = new CheckingPalindrome();
        boolean isPalindrome = CheckingPalindrome.isPalindrome(word,0,word.length()-1);
        System.out.println("Is "+word+" palindrome --> "+isPalindrome);
    }

    //
    static boolean isPalindrome(String word, int start, int end) {
        if(start >= end)
            return true;
        return (word.charAt(start) == word.charAt(end) && isPalindrome(word, start+1,end-1));
    }
}
