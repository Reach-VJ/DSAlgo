package com.reachingskies.geeksandgeeks.arrays;


/**
 * Kadans algorithm
 */

public class MaxSumSubArray {

    public static void main(String [] args) {
        //int [] array = {1,-2,3,-1,2};
        int [] array = {-5,1,-2,3,-1,2,-2};
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        int maxSum = maxSumSubArray.maxSumSubArrayOptimal(array);
        System.out.println("Max Sum SubArray "+ maxSum);
    }

    // Time : O(n)
    // Space : O(1)
    int maxSumSubArrayOptimal(int [] array) {
        int maxSum = array[0];
        int result = array[0];

        for(int i = 1; i < array.length; i++) {
            maxSum = Integer.max(maxSum+array[i],array[i]);
            result = Integer.max(result,maxSum);
        }
        return result;
    }

    // Time : O(n * n)
    // Space : O(1)
    int maxSumSubArray(int [] array) {
        int maxSum = array[0];

        for(int i = 0; i < array.length; i++) {
            int current = 0;
            for(int j = i; j< array.length; j++) {
                current = current+array[j];
                maxSum = Integer.max(maxSum,current);
            }
        }
        return maxSum;
    }
}
