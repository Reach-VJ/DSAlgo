package com.reachingskies.geeksandgeeks.arrays;

public class LeadersInArray {

    public static void main(String [] args) {
        //int [] array = {30,20,10};
        int [] array = {16, 17, 4, 3, 5, 2};
        LeadersInArray leaders = new LeadersInArray();
        leaders.leadersInArrayOptimal(array);
    }

    // Time : O(n)
    // Space : O(1)
    void leadersInArrayOptimal(int [] array) {
        int length = array.length-1;
        int max = array[length];
        System.out.print(max +" ");
        for(int i = length-1; i>=0;i--) {
            if(array[i] > max) {
                System.out.print(array[i] +" ");
                max = array[i];
            }
        }
    }

    // Time : O(n * n)
    // Space : O(1)
    void leadersInArray(int [] array) {
        for(int i = 0; i < array.length; i++) {
            int j = 0;
            for(j = i+1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    break;
                }
            }
            if(j == array.length) {
                System.out.println(array[i]);
            }
        }
    }
}
