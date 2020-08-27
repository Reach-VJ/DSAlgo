package com.reachingskies.geeksandgeeks.practice.array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String [] args) {
        int [] num1 = {2,2,3,4,0,0,0};
        int [] num2 = {1,5,6};
        int m = 4;
        int n = 3;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.mergeSortedArraysOptimal(num1,m,num2,n);
    }

    // Time :O(n)
    // Space : O(1)
    // Technique : Fill the elements from back.
    void mergeSortedArraysOptimal(int [] num1, int m, int [] num2, int n) {
        int tail1 = m-1;
        int tail2 = n-1;
        int finished = m+n-1;

        while(tail2 >= 0 && tail1 >=0) {
            num1[finished--] = num1[tail1] > num2[tail2] ? num1[tail1--]:num2[tail2--];
        }
        while(tail2>=0)
            num1[finished--] = num2[tail2--];
        System.out.println("Sorted elements --> "+ Arrays.toString(num1));


    }


    // Time : O(n)
    // Space : O(n)
    //Creating temp array to store the sorted elements.
    void mergeSortedArrays(int [] num1, int m, int [] num2,int n) {

        int [] temp = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j <n ) {
            if(num1[i] < num2[j]) {
                temp[k] = num1[i];
                i++;
                k++;
            } else {
                temp[k] = num2[j];
                k++;
                j++;
            }
        }
        while(i<m) {
            temp[k] = num1[i];
            k++;
            i++;
        }
        while(j<n) {
            temp[k] = num2[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(temp));

    }
}
