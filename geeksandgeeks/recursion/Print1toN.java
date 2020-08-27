package com.reachingskies.geeksandgeeks.recursion;

public class Print1toN {

    public static void main(String [] args) {
        Print1toN.print1ToN(5);
    }

    static void print1ToN(int number) {
        if(number == 0) {
            return;
        }
        print1ToN(number-1);
        System.out.print(" "+number+" ");
    }
}
