package com.reachingskies.geeksandgeeks.matrix;

public class SnakePattern {

    public static void main(String [] args) {
        int [][] array2D = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        SnakePattern.snakePattern(array2D);
     }

    static void snakePattern(int [][] array2D) {

        for(int i = 0; i < array2D.length; i++) {
            if(i%2 == 0)
                for(int j = 0; j < array2D[i].length; j++) {
                    System.out.print(array2D[i][j]+" ");
                }
            else
                for(int j = array2D[i].length-1; j >= 0; j--) {
                    System.out.print(array2D[i][j]+" ");
                }
        }

    }
}
