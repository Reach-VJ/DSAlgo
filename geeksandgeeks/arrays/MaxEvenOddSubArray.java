package com.reachingskies.geeksandgeeks.arrays;

public class MaxEvenOddSubArray {

    public static void main(String [] args) {
        int [] array = {5,10,20,6,3,8};
        MaxEvenOddSubArray maxEvenOddSubArray = new MaxEvenOddSubArray();
        int maxEvenOdd = maxEvenOddSubArray.maxEvenOddSubArray(array);
        System.out.println("Max Even Odd Array : "+maxEvenOdd);
    }

    // Time : O(n)
    // Space : O(1)
    int maxEvenOddSubArray(int [] array) {
        int maxSize = 1;
        int current = 1;

        for(int i = 1; i < array.length; i++) {
            if((array[i]%2==0 && array[i-1]%2!=0) || (array[i]%2!=0 && array[i-1]%2==0)) {
                current++;
                maxSize = Integer.max(maxSize,current);
            } else {
                current = 1;
            }

        }
        return maxSize;
    }
}
