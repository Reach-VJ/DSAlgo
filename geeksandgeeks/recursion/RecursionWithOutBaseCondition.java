package com.reachingskies.geeksandgeeks.recursion;

public class RecursionWithOutBaseCondition {

    public static void main(String [] args) {
        fun();
    }

    static void fun() {
        System.out.println("KGF");
        fun();
    }
}
