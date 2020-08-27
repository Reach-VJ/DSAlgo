package com.reachingskies.geeksandgeeks.arrays;

import java.util.Arrays;

public class MinimumFlipsToMakeGroupSame {

    public static void main(String [] args) {
        int [] array = {1,1,0,0,0,1,1,0,1,1,1};
        MinimumFlipsToMakeGroupSame minFlips = new MinimumFlipsToMakeGroupSame();
        int flipCount = minFlips.minimumFlips(array);
        System.out.println("Minimum flips : "+flipCount);
        minFlips.printFlipGroupElements(array);
    }

    void printFlipGroupElements(int [] array) {
        int start = 0;
        int end = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] != array[i-1]) {
                if(array[0] != array[i]) {
                    start = i;
                } else {
                    end = i-1;
                    System.out.print(Arrays.toString(Arrays.copyOfRange(array,start,end+1)));
                }
            }
        }
        if(array[array.length-1] != array[0])
            System.out.print(array[array.length-1]);
    }

    // Time : O(n)
    // Space : O(1)
    // This calculates the no of flips when you try to flip, all remaining elements to opposite of existing.
    // 1 0 1 1
    // first flip : 1 1 0 0
    // second flip : 1 1 1 1
    //Number of flips : 2
    int minimumFlips(int [] array) {
        int flips = 0;

        for(int i = 1; i < array.length; i++) {
            if(array[i] != array[i-1]) {
                flips++;
            }
        }
        return flips;
    }
}
