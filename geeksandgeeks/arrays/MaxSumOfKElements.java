package com.reachingskies.geeksandgeeks.arrays;

public class MaxSumOfKElements {

    public static void main(String [] args) {
        int [] array = {1,8,30,-5,20,7};
        MaxSumOfKElements maxSumOfKElements = new MaxSumOfKElements();
        int maxSum = maxSumOfKElements.maxSumOfKElementsOptimal(array,3);
        System.out.println("Max Sum : "+maxSum);
    }

    // Time : O(n * n)
    // Space : O(1)
    // Brute force
    int maxSumOfKElements(int [] array, int k) {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i+k-1< array.length; i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum = sum+ array[i+j];
            }
            maxSum = Integer.max(sum,maxSum);
        }
        return maxSum;
    }

    // Time : O(n)
    // Space : O(1)
    // Sliding window

    int maxSumOfKElementsOptimal(int [] array, int k) {
        int sum = array[0] + array[1]+ array[2];
        int maxSum = sum;
        int start = 0, end = array.length-k;

        while(end < array.length) {
            sum = sum - array[start]+array[end];
            start++;
            end++;
            maxSum = Integer.max(sum,maxSum);
        }
        return maxSum;
    }
}
