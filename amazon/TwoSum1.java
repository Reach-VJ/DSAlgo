package com.reachingskies.amazon;

import java.util.*;
public class TwoSum1 {

    public static void main(String [] args) {
        int [] array = {2,7,11,15};
        int target = 9;
        int [] targetArray = TwoSum1.twoSum(array,target);
        System.out.println(targetArray[0] +"  -->  "+targetArray[1]);
    }

    static int [] twoSum(int [] array, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])) {
                map.put(target-array[i],i);
            } else {
                return new int[]{map.get(array[i]),i};
            }
        }

        return new int[]{-1,-1};
    }
}
