package com.reachingskies.geeksandgeeks.arrays;

public class TappingRainWater {

    public static void main(String [] args) {
        //int [] array = {5,0,1,2,3};
        int [] array = {0,1,0,2,1,0,1,3,2,1,2,1};
        TappingRainWater rainWater = new TappingRainWater();
        int maxWater = rainWater.getMaxWaterOptimal(array);
        System.out.println("Max water collected --> "+maxWater);
    }

    // Time : O(n * n)
    // Space : O(1)
    int getMaxWater(int[] array) {
        int result = 0;

        for (int i = 1; i < array.length - 1; i++) {
            int lmax = array[i];
            int rmax = array[i];
            for (int j = 0; j < i; j++) {
                lmax = Integer.max(lmax, array[j]);
            }

            for (int j = i + 1; j < array.length; j++) {
                rmax = Integer.max(rmax, array[j]);
            }
            result = result + Integer.min(lmax, rmax) - array[i];
        }
        return result;
    }

    // Time : O(n)
    // Space : O(n) Storing LMax and RMax array details.
    // Calculate LMax and RMax and checking the min of LMax and RMax and deducting the element.
    int getMaxWaterOptimal(int [] array) {
        int [] lMax = new int[array.length];
        int [] rMax = new int[array.length];
        lMax[0] = array[0];
        rMax[array.length-1] = array[array.length-1];
        int result = 0;

        for(int i = 1; i < array.length; i++) {
            lMax[i] = Integer.max(lMax[i-1], array[i]);
        }

        for(int j = array.length-2; j>=0; j--) {
            rMax[j] = Integer.max(rMax[j+1], array[j]);
        }

        for(int i = 1; i < array.length-1;i++) {
            int walterAt = Integer.min(lMax[i-1],rMax[i+1]) - array[i];
            result = result + (walterAt <= 0 ? 0 : walterAt);
        }
        return result;
    }
}
