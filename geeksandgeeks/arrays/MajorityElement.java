package com.reachingskies.geeksandgeeks.arrays;

// What is Majority Element ?
// Any Element which appears more than half of the size of the array.
// {8,2,3,8,8}
// Array size is 5 and n/2 is : 2
// 8 appears 3 times, more than 2.
public class MajorityElement {

    public static void main(String [] args) {
        int [] array = {8,1,2,8,8};
        MajorityElement element = new MajorityElement();
        int majority = element.findMajorityElementOptimal(array);
        System.out.println("Found Majority element --> "+majority);
    }

    // Time : O(n)
    // Space : O(1)
    // Calculate Majority element first and check whether that element count more than half of array.
    int findMajorityElementOptimal(int [] array) {

        //Calculating Majority element.
        int result = 0;
        int count = 1;

        for(int i = 1; i < array.length; i++) {
            if(array[result] == array[i]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                result = i;
                count = 1;
            }
        }

        count = 0;
        //Checking Majority element more than half size of the array.
        for(int i = 0; i< array.length; i++) {
            if(array[result] == array[i]) {
                count++;
            }
        }
        if(count< array.length/2) {
            return -1;
        }
        return result;

    }

    // Time : O(n * n)
    // Space : O(1)
    int findMajorityElement (int [] array) {

        for(int i = 0; i < array.length; i++) {
            int count = 1;
            for(int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(count > array.length/2) {
                return array[i];
            }
        }
        return -1;
    }
}
