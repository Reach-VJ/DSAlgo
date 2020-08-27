package com.reachingskies.geeksandgeeks.arrays;

//Find Equie point : where left sum and right sum are equal.

public class FindEquilibriumPoint {

    public static void main(String [] args) {
        int [] array = {3,4,8,-9,20,6};
        FindEquilibriumPoint equilibriumPoint = new FindEquilibriumPoint();
        boolean equePoint = equilibriumPoint.findEquiPoint(array);
        System.out.print("Find Queue point : "+equePoint);
    }

    // Time : O(n)
    // Space : O(1)
    // Calculate sum and compare with LeftSum and Sum-array[i] if condition satisfy. return true.
    boolean findEquiPoint(int [] array) {
        //int [] array = {3,4,8,-9,20,6};
        int sum = 0;
        int lSum = 0;

        for(int i = 0; i < array.length; i++) {
            sum = sum+array[i];
        }
        for(int i = 0; i < array.length; i++) {
            if(lSum == sum - array[i]) {
                return true;
            }
            lSum += array[i];
            sum -=array[i];
        }
        return false;
    }
}
