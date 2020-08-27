package com.reachingskies.geeksandgeeks.recursion;

public class RecurstionExample {

    public static void main(String [] args) {
        recursion(3);
    }

    static void recursion(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        recursion(n-1);
        System.out.println(n);
    }
}
