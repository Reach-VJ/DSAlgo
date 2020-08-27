package com.reachingskies.geeksandgeeks.arrays;

public class MaxDifference {

    public static void main(String [] args) {
        int [] array = {2,3,4,6,4,8,25};
        MaxDifference maxDifference = new MaxDifference();
        //int maxDiff = maxDifference.maxDiff(array);
        int maxDiff = maxDifference.maxDiffOptimal2(array);
        System.out.println("Max Diff : "+maxDiff);

    }

    // Time : O(n * n)
    // Space : O(1)
    int maxDiff(int [] array) {
        int result = array[1] - array[0];

        for(int i = 0; i < array.length-1; i++) {
            for(int j = i+1; j < array.length; j++) {
                result = Integer.max(result, array[j]-array[i]);
            }
        }
        return result;
    }

    // Time : O(n)
    // Space : O(1)
    int maxDiffOptimal(int [] array) {
        int result = array[1]- array[0];
        int minValue = array[0];

        for(int i = 1; i < array.length; i++) {
            result = Integer.max(result, array[i]-minValue);
            minValue = Integer.min(minValue,array[i]);
        }
        return result;
    }

    // Time : O(n)
    // Space : O(1)
    int maxDiffOptimal2(int [] array) {
        int min = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            min = Integer.min(min, array[i]);
            max = Integer.max(max, array[i]);
        }
        return max-min;
    }
}
