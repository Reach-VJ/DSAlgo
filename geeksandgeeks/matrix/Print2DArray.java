package com.reachingskies.geeksandgeeks.matrix;

public class Print2DArray {

    public static void main(String [] args) {
        Print2DArray.print2DArray();
    }

    static void print2DArray() {

        int [][] array2D = new int[3][];

        for(int i = 0; i < array2D.length; i++) {
            array2D[i] = new int[i+1];
            for(int j = 0; j < array2D[i].length; j++ ) {
                array2D[i][j] = i;
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }

    }

}
