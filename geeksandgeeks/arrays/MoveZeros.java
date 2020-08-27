package com.reachingskies.geeksandgeeks.arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String [] args) {
        int [] array = {1,2,3,4,0,5,6,7,0,9};
        MoveZeros moveZeros = new MoveZeros();
        System.out.println("Array before moving zeros to right : "+ Arrays.toString(array));
        System.out.println("Array after moving zeros to right : "+Arrays.toString(moveZeros.moveZerosOptimal(array)));
    }

    // Time : O(n)
    // Space : O(1)

    int [] moveZerosOptimal(int [] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                int temp = array[count];
                array[count] = array[i];
                array[i] = temp;
                count++;
            }
        }
        return array;
    }


    // Time : O(n)
    // Space : O(1)
    // ** Not in Same Order **
    int [] moveZeros(int [] array) {

        int i = 0;
        int j = array.length-1;

        while(i<=j) {
            while(array[i]!=0) {
                i++;
            }
            while(array[j] == 0) {
                j--;
            }
            if(i<j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        return array;
    }

    // Time : O(n)
    // Space : O(n)
    int [] moveZeros1(int [] array) {
        int [] temp = new int[array.length];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 0)
                temp[j++] = array[i];
        }
        return temp;
    }

    // Time : O(n * n)
    // Space : O(n)
    int [] moveZeros2(int [] array) {
        int i = 0;
        int j = array.length-1;

        while(i <= j) {
            if(array[i] == 0) {
               int n = i;
               while(n<j) {
                   if(array[n+1]!=0) {
                       int temp = array[n+1];
                       array[n+1] = array[i];
                       array[i] = temp;
                       i++;
                   }
                   n++;
               }
            }
            i++;
        }
        return array;
    }
}
