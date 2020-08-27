package com.reachingskies.arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Set;

public class TwoSum {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] array = solution.twoSumOptimal(new int[]{2, 7, 11, 15}, 18);

        System.out.println(Arrays.toString(array));

    }
}

class Solution1 {

    int[] twoSum(int[] array, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            } else {
                map.put(array[i],i);
            }
        }
        return new int[]{0, 0};

    }

    // T
    int[] twoSumOptimal(int[] array, int target) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < array.length; i++) {
            if(!set.contains(array[i])) {
                set.add(target-array[i]);
            }
            else {
                return new int[]{target-array[i],array[i]};
            }
        }
        return new int[]{0,0};
    }
}