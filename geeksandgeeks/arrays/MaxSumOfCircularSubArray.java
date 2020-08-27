package com.reachingskies.geeksandgeeks.arrays;

public class MaxSumOfCircularSubArray {

    public static void main(String [] args) {
        int [] array = {5,-1,2,4};
        MaxSumOfCircularSubArray circularSubArray = new MaxSumOfCircularSubArray();
        int maxSum = circularSubArray.maxSumOfCicullarSubArray(array);
        System.out.println("Max sum of circular sub array --> "+maxSum);
    }

    // Time : O(n)
    // Space : O(1)
    // Calculating Max Sum Sub Array Kadan's algorithm
    // Max Sum of Circular Sub Array ( Total array sum - Minimum of Sub Array (Passing tilted values)
    // Getting max of Normal Max and Circular Max.

    int maxSumOfCircularSubArrayOptimal(int [] array) {
        int normalMaxSum = maxNormal(array);
        if(normalMaxSum < 0) {
            return normalMaxSum;
        }
        int arraySum = 0;
        for(int i = 0; i < array.length; i++) {
            arraySum = arraySum+array[i];
            array[i] = -array[i];
        }
        int curcularMaxSum = arraySum+maxNormal(array);
        return Integer.max(normalMaxSum,curcularMaxSum);

    }

    int maxNormal(int [] array) {
        int result = array[0];
        int maxSubArray = array[0];
        int maxCircularSubArray = array[0];

        for(int i = 1; i < array.length; i++) {
            maxSubArray = Integer.max(maxSubArray+array[i], array[i]);
            result = Integer.max(maxSubArray,result);
        }
        return result;
    }

    // Time : O(n * n)
    // Space : O(1)

    int maxSumOfCicullarSubArray (int [] array) {

        int result = array[0];

        for(int i = 0; i < array.length; i++) {
            int current_sum = array[i];
            int current_max = array[i];

            for(int j = 1; j< array.length; j++) {
                int index = (i+j)%array.length;
                current_sum = current_sum+array[index];
                current_max = Integer.max(current_max,current_sum);
            }

            result = Integer.max(current_max,result);
        }
        return result;
    }
}
