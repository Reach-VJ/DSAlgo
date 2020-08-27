package com.reachingskies.geeksandgeeks.matrix;

public class RotateTo90Degrees {

    public static void main(String [] args) {
        int [][] array = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        RotateTo90Degrees.rotateTo90Degress(array);
    }

    static void rotateTo90Degress(int [][] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for(int i = 0; i < array.length; i++) {
            int low = 0; int high = array.length-1;
            while(low < high) {
                int temp = array[low][i];
                array[low][i] = array[high][i];
                array[high][i] = temp;
                low++;
                high--;
            }
        }



    }
}
