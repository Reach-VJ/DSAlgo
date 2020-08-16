package com.reachingskies.geeksandgeeks.strings;

public class PrintCharFrequencies {

    public static void main(String [] args) {
        String str = "geeksforgeeks";
        PrintCharFrequencies.printCharFrequencies(str);
    }

    // Print Chars and their frequencies from string with O(n) time complexity
    // Input : "geeksforgeeks"
    // Output : e -> 4 f -> 2 g -> 2....etc
    // Time : O(n)
    // Space : O(n)
    static void printCharFrequencies(String str) {

        int [] count = new int[26]; // All values are zeros.

        //Increment the value of the array element based on char.
        for(int i = 0; i < str.length(); i++ ) {
            //First Char : g ASCII number is 103 - 97 () : count[6] increased to 1
            count[str.charAt(i)-'a']++;
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] > 0)
                //Print the char and frequency if char frequency more than 0
                System.out.println(" "+(char)(i+'a')+" --> "+count[i]);
        }

    }
}
