package com.reachingskies.geeksandgeeks.matrix;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String [] args) {
        int [][] array = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        TransposeMatrix.transpose(array);
    }

    static void transpose(int [][] array) {
        for(int i = 0; i< array.length; i++) {
            for(int j = i+1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
            System.out.print(Arrays.toString(array[i])+"\n");
        }
    }
}
