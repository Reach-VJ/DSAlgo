package com.reachingskies.geeksandgeeks.recursion;

public class Recursion2TailRecursion {

    public static void main(String [] args) {
        Recursion2TailRecursion.recursion2Tail(1000,1);
    }

    static void recursion2Tail(int n, int k) {
        if(n == 0)
            return;
        System.out.println(" "+k+" ");
        recursion2Tail(n-1,k+1);
    }
}
