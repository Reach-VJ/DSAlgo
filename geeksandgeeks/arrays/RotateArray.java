package com.reachingskies.geeksandgeeks.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String [] args) {
        int [] array = new int[]{1,2,3,4,5,6,7};
        int rotation = 2;

        RotateArray rotateArray = new RotateArray();
        System.out.println("Array before rotation : "+ Arrays.toString(array));
        array = rotateArray.rotateArray1(array,rotation);
        System.out.println("Array after rotation : "+ Arrays.toString(array));
    }

    // Time : O(n)
    // Space : O(n)
    int [] rotateArray(int [] array, int rotation) {
        int [] tempArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            tempArray[i] = array[(i+rotation)% array.length];
        }
        return tempArray;
    }

    // Time : O(n)
    // Space : O(1)

    int [] rotateArray1(int [] array, int rotation) {

        int i = 0; int j = rotation-1;
        rotate(array,i,j);

        i = rotation; j = array.length-1;
        rotate(array,i,j);

        i = 0; j = array.length-1;
        rotate(array,i,j);
        return array;
    }

    void rotate(int [] array, int start, int end) {
        while(start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
