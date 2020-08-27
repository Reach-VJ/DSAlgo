package com.reachingskies.geeksandgeeks.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesInSortedArray {

    public static void main(String[] args) {
        //int[] array = {10, 10, 10, 25, 30, 30};
        //int [] array = {10,10,10,10};
        int [] array = {10,20,30};
        FrequenciesInSortedArray frequencies = new FrequenciesInSortedArray();
        System.out.println("****Printing frequencies of elements of Sorted Array ****");
        frequencies.frequencies(array);
        System.out.println("****Printing frequencies of elements of Unsorted Array ****");
        int [] unsortedArray = {1,3,4,7,4,5,6,10,2,2};
        //frequencies.frequenciesOfUnsortedArray(unsortedArray);
        frequencies.frequenciesOfUnsorted(unsortedArray);

    }

    // Time : O(n)
    // Space : O(n)
    void frequenciesOfUnsortedArray(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }
        System.out.println(map);
    }

    //
    void frequenciesOfUnsorted(int [] array) {
        int n = array.length;

        //{1,3,4,7,4,5,6,10,2,2};

        for(int i = 0; i < n; i++) {
            array[array[i]%n] = array[array[i]%n] + n;
        }

        for(int i = 0; i < n; i++) {
            if(array[i]/n !=0)
                System.out.println(i+ " "+ array[i]/n);
        }
    }

    // Time : O(n)
    // Space : O(1)
    void frequencies(int[] array) {
        int frequency = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                frequency++;
            } else {
                System.out.println(" Element : " + array[i - 1] + " Frequency --> " + frequency);
                frequency = 1;
            }
            if(i == array.length-1)
                System.out.println(" Element : " + array[i] + " Frequency --> " + frequency);
        }
    }
}
