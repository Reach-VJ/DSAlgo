package com.reachingskies.geeksandgeeks.arrays;

public class MaxConsecutive1s {

    public static void main(String [] args) {
        int [] array = {0,1,1,0,1,1,1,1};
        MaxConsecutive1s maxConsecutive1s = new MaxConsecutive1s();
        int maxCount = maxConsecutive1s.maxConsecutive1s(array);
        System.out.println("Max Consecutive 1s --> "+maxCount);
    }

    // Time : O(n)
    // Space : O(1)
    int maxConsecutive1s(int [] array) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                count = 0;
            } else {
                count++;
                max = Integer.max(max,count);
            }
        }
        return max;

    }
}
