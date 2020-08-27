package com.reachingskies.geeksandgeeks.matrix;

public class PrintBoundaries {

    public static void main(String [] args) {
        //int [][] array2D = new int[][] {{1,2,3,4}};

        //int [][] array2D = new int[][] {{1},{2},{3},{4}};

        int [][] array2D = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintBoundaries.printBoundaries(array2D);
    }


    static void printBoundaries(int [][] array2D) {
        int r = array2D.length;
        int c = array2D[0].length;

        if (array2D.length == 1) {
            for (int i = 0; i < array2D[0].length; i++) {
                System.out.print(array2D[0][i]+" ");
            }
        } else if (array2D[0].length == 1) {
            for(int j = 0; j < array2D.length; j++) {
                System.out.print(array2D[j][0]+" ");
            }
        } else {
            for(int i = 0; i < c; i++) {
                System.out.print(array2D[0][i]+" ");
            }
            for(int i = 1; i < array2D.length; i++) {
                System.out.print(array2D[i][c-1]+" ");
            }
            for(int i = c-2; i >=0; i--) {
                System.out.print(array2D[r-1][i]+" ");
            }
            for(int i = r-2; i >= 1 ; i--) {
                System.out.print(array2D[i][0]+" ");
            }
        }

    }
}
