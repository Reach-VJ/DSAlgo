package com.reachingskies.amazon;

import java.util.Arrays;

public class KClosestPointsToOrigin {

    public static void main(String [] args) {
        int [][] array = {{3,3},{5,-1},{-2,4}};
        int K = 2;
        array = KClosestPointsToOrigin.kClosest(array,K);
    }

    static public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points,(p1,p2) ->p1[0]*p1[0]+p1[1]+p1[1] - p2[0]*p2[0]+p1[1]+p1[1]);
        return Arrays.copyOfRange(points,0,K);

    }
}
