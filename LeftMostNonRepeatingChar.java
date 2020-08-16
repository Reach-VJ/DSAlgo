package com.reachingskies.geeksandgeeks.strings;

public class LeftMostNonRepeatingChar {

    public static void main(String [] args) {
        String str = "hello";
        int index = LeftMostNonRepeatingChar.leftMostNonRepeatedChar(str);
        System.out.println("Left most non repeated element from "+str+" --> "+str.charAt(index));
    }

    // Input : "hello"
    // Output : 0 (or h) Its left most non repeating char.
    // Time : O(n)
    // Space : O(n)
    // Logic : Tracking the not repeating char index from right to left.
    //       : return index or -1.
    static int leftMostNonRepeatedChar(String str) {
        if(str == null || str.length() == 0)
            return -1;
        int index = -1;
        boolean [] visitTracker = new boolean[256];
        for(int i = str.length()-1; i>=0; i--) {
            if(visitTracker[str.charAt(i)] != true)
                index = i;
            else
                visitTracker[str.charAt(i)] = true;
        }
        return index;
    }
}
